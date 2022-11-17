package QAI;

/**
 * * if you have number 15 make 1+5 as output
 *
 *
 */
public class QAISplitAndSumNumber {
    public static void main(String[] args) {

        System.out.println(sumNumbers(1050));
    }



    public static int sumNumbers(int number){

        String tempNumber = Integer.toString(number);
        int numberToSum=0;

        for(int i=0; i<tempNumber.length(); i++){
           numberToSum+= Integer.parseInt(String.valueOf(tempNumber.charAt(i)));
        }




        return numberToSum;
    }
}
