package QAI;

/**
 * You are given an array of n integers and a number k. Determine whether there is a pair
 * of elements in the array that sums to exactly k.
 * For example, given the array [1, 3, 7] and k = 8, the answer is “yes,”
 * but given k = 6 the answer is “no
 *
 *
 */

public class QAITwoSum {

    public static void main(String[] args) {

        int [] myListNumbers = new int[]{2, 4, 6, 8};


        System.out.println(myListNumbers.length);
        System.out.println(twoSum(myListNumbers, 10));

    }


    public static boolean twoSum(int [] numbers, int k){


        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(j!=i && (numbers[i]+numbers[j])==k){
                    return true;
                }
            }
        }
        return  false;
    }




}
