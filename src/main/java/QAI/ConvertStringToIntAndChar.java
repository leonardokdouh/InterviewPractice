package QAI;

import java.util.Arrays;

public class ConvertStringToIntAndChar {

    public static void main(String[] args) {

        String number = "104";


        //Using parseInt

        int numberCero = Integer.parseInt(number);
        System.out.println("Using parseInt method "+ numberCero);

        //converting String into Integer using Integer.valueOf() method

        int numb = Integer.valueOf(number);
        System.out.println("using valueOf method = "+numb);



        //String/Int to char [] of ints.
        int numerito = 1010098;
        String numer = String.valueOf(numerito);
        int multiplier =10;

        int[] intArray = new int[numer.length()];
        System.out.println(numer.length());


        for( int i=0; i<numer.length(); i++){

            intArray[i]= Integer.parseInt(String.valueOf(numer.charAt(i)));

        }


        for (int asd : intArray){
            System.out.print(asd);
        }

        System.out.println(Arrays.toString(intArray));


    }
}
