package Leo.sumanEx1.billing;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * We accidentally dropped the database where we store the current billing status for our advertisers. Fortunately, we still have the logs for all the transactions they did, and we can use this to recreate the dropped data. You are asked to process the financial transactions from the old system to build up a BillingStatus per user to be stored in our new system. You should create a class called BillingStatus, which will represent an account state. Each financial transaction represents a modification to a BillingStatus. A BillingStatus should be able to ingest new transactions that are generated in our own systems. Given a collection of financial transactions, we want to generate a BillingStatus instance for each user. This can be represented as a dict:
     * { user_id: BillingStatus(), user_id2: BillingStatus()}
     * <p>
     * Our BillingStatus class should start with two monetary columns:
     * ‘ad_delivery_pennies’: 0, ‘payment_pennies’: 0
     * <p>
     * Each transaction can have multiple monetary columns. Upon processing a transaction, the values in the monetary columns should be added to the current value in the BillingStatus.
     * <p>
     * Expected Output
     * {1=ad_delivery_pennies: 7000 payment_pennies: 1000, 2=ad_delivery_pennies: 1000 payment_pennies: 500, 3=payment_pennies: 500}
     * <p>
     * Main class should be named ‘Solution’
     */

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> test = new HashMap<>();

        test.put("tran1", Map.<String, Integer>of(
                "user_id", 1,
                "ad_delivery_pennies", -1000,
                "transaction_timestamp", 1500000002
        ));
        test.put("tran2", Map.<String, Integer>of(
                "user_id", 1,
                "ad_delivery_pennies", 5000,
                "transaction_timestamp", 1500000001
        ));
        test.put("tran3", Map.<String, Integer>of(
                "user_id", 1,
                "payment_pennies", 500,
                "transaction_timestamp", 1500000003
        ));
        test.put("tran4", Map.<String, Integer>of(
                "user_id", 1,
                "ad_delivery_pennies", 1000,
                "transaction_timestamp", 1500000004,
                "payment_pennies", 500
        ));
        test.put("tran5", Map.<String, Integer>of(
                "user_id", 2,
                "ad_delivery_pennies", 1000,
                "transaction_timestamp", 1500000005,
                "payment_pennies", 500
        ));
        test.put("tran6", Map.<String, Integer>of(
                "user_id", 2,
                "payment_pennies", 500,
                "transaction_timestamp", 1500000005
        ));
        test.put("tran6", Map.<String, Integer>of(
                "user_id", 3,
                "payment_pennies", 1000,
                "transaction_timestamp", 1500000005
        ));
        System.out.println(solution(test));
    }

        public static Map<Integer, BillingStatus> solution (Map < String, Map < String, Integer >> restoredData){
            Map<Integer, BillingStatus> output = new HashMap<>();
            for (Map.Entry<String, Map<String, Integer>> firstEntry : restoredData.entrySet()) {
                Integer userId = null;
                int paymentPennies = 0, deliveryPennies = 0;
                BillingStatus aux;
                for (Map.Entry<String, Integer> secondEntry : firstEntry.getValue().entrySet()) {
                    switch (secondEntry.getKey()) {
                        case "user_id": {
                            userId = secondEntry.getValue();
                            break;
                        }
                        case "payment_pennies": {
                            paymentPennies = secondEntry.getValue();
                            break;
                        }
                        case "ad_delivery_pennies": {
                            deliveryPennies = secondEntry.getValue();
                            break;
                        }
                    }
                }
                if (output.containsKey(userId)) {
                    aux = output.get(userId);
                    aux.setPayment_pennies(aux.getPayment_pennies() + paymentPennies);
                    aux.setAd_delivery_pennies(aux.getAd_delivery_pennies() + deliveryPennies);
                } else {
                    aux = new BillingStatus(deliveryPennies, paymentPennies);
                }
                output.put(userId, aux);
            }
            return output;
        }

}

