package QAI;

import java.util.Arrays;

public class ConvertStringToIntAndChar {

    public static void main(String[] args) {

        String number = "104";


        //Using parseInt

        int i = Integer.parseInt(number);
        System.out.println("Using parseInt method "+ i);

        //converting String into Integer using Integer.valueOf() method

        int numb = Integer.valueOf(number);
        System.out.println("using valueOf method = "+numb);



        //String/Int to char [] of ints.
        int numerito = 1010098;
        String numer = String.valueOf(numerito);

        char[] intArray = new char[numer.length()];

        for(int j=0; j<numer.length(); j++){
            intArray[j]= (char) Character.digit(numer.charAt(j), 10);
        }

        for (char asd : intArray){
            System.out.print(asd);
        }

        int addingEveryNumber= 0;
        for(int k=0; k<intArray.length; k++){
            addingEveryNumber+= intArray.toString().charAt(k);
        }
        System.out.println(numerito);

    }
}
