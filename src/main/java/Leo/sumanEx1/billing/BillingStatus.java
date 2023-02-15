package Leo.sumanEx1.billing;

public class BillingStatus {

        private int ad_delivery_pennies;
        private int payment_pennies;

    public BillingStatus(int ad_delivery_pennies, int payment_pennies) {
        this.ad_delivery_pennies = ad_delivery_pennies;
        this.payment_pennies = payment_pennies;
    }



        public int getAd_delivery_pennies() {
        return ad_delivery_pennies;
    }

        public void setAd_delivery_pennies(int ad_delivery_pennies) {
        this.ad_delivery_pennies = ad_delivery_pennies;
    }

        public int getPayment_pennies() {
        return payment_pennies;
    }

        public void setPayment_pennies(int payment_pennies) {
        this.payment_pennies = payment_pennies;
    }

        @Override
        public String toString() {
        return
                ", ad_delivery_pennies=" + ad_delivery_pennies +
                ", payment_pennies=" + payment_pennies +
                '}';

    }
}
