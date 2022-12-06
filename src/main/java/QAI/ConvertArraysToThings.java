package QAI;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertArraysToThings {

    public static void main(String[] args) {

        // de int[] a char

        //An array with specific elements
        String[] myStringArray = {"one", "two", "five"};
        int[] myIntArray = {2, 4, 5, 6};


        //Printing using Arrays.deepToString
        System.out.println("Using deep method =" + Arrays.deepToString(myStringArray));

        //An array of size 4, without anything.
        String[] myOtherString = new String[4];
        myOtherString[0] = "hola";
        myOtherString[1] = "adios";
        int[] myOtherInt = new int[4];
        myOtherInt[0] = 2;

        //Parsing String/int Array to String
        String myStringOfString = Arrays.toString(myStringArray);
        String myStringOfNumbers = Arrays.toString(myIntArray);

        System.out.println("This is parsing a string[] =" + myStringOfString);
        System.out.println("This is parsing a int[] =" + myStringOfNumbers);


        //Using StringBuilder.append()
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : myStringArray) {
            stringBuilder.append(string + ", ");
        }

        StringBuilder stringIntBuilder = new StringBuilder();
        for (int myInts : myIntArray) {
            stringIntBuilder.append(myInts);
        }
        System.out.println("this is using SB.append() " + stringBuilder);
        System.out.println(stringIntBuilder);


        //Using Collectors.joining()
        String joinedString = Arrays.stream(myStringArray).collect(Collectors.joining());
        System.out.println("this is using Joining = "+ joinedString);



    }
}
