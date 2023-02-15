package Leo;

public class aaapractice {


    public static void main (String [] args){

        //here i will call my method just to have more fun.
        String inputOne = "3[as]";
        String inputTwo = "3[asd]5[a]3[asd]5[a]";
        String inputThree = "1[a2[j12[k]]]";



        System.out.println(moreNumbers(inputThree));

    }


    public static String repeatAgain (String input){

        int open = input.indexOf("[");
        int close= input.indexOf("]", open);
        int number = Character.getNumericValue(input.charAt(open-1));

        String substring = input.substring(open+1, close);

        return substring.repeat(number);
    }



    public static String allRepeat(String input){
        while(input.contains("[")){
            int open = input.lastIndexOf("[");
            int close = input.indexOf("]", open);
            int number = Character.getNumericValue(input.charAt(open-1));

            String subString = input.substring (open+1, close);

            input= input.replace(input.substring(open-1, close+1), subString.repeat(number));
        }
        return input;
    }

    public static String moreNumbers(String input){

        String regex = "[0-9]";

        while(input.contains("[")){

            int open = input.lastIndexOf("[");
            int close = input.indexOf("]", open);

            String substring = input.substring(open+1, close);

            int actualPosition = open;

            while ( actualPosition > 0 && input.substring(actualPosition-1, actualPosition).matches(regex) ){
                actualPosition--;
            }
            Integer repeat = Integer.valueOf(input.substring(actualPosition, open));

            input=input.replace(input.substring(actualPosition, close+1), substring.repeat(repeat));


        }
return input;

    }









    public static int invertMyNumber(int input){
        int result = 0;
        while (input>0){
            int lastNumber= input%10;
            result = result*10 + lastNumber;
            input= input/10;
        }
        return result;
    }

    public static int sumNumbers(int input){
        int result =0;
        while(input>0){
            result += input%10;
            input=input/10;
        }
        return result;
    }


}
