package QAI;

import java.util.Arrays;

public class ConvertStringToArray {
    public static void main(String[] args) {

        String word = "loremipsum";



        //Using toCharArray()
        char[] myFirstArray = word.toCharArray();
        System.out.println("Solution using toCharArray");
        for(char letter: myFirstArray){
            System.out.print(letter);
        }

        //Using split method we can divide the string into an array of letters
        System.out.println("");
        String [] myLettersArray = word.split("");

        System.out.println("print using deep= "+Arrays.deepToString(myLettersArray));

        System.out.println("Printing using Arrays.toString = " +Arrays.toString(myFirstArray));
        System.out.println("Printing using a foreach cicle");

        for(String letters: myLettersArray){
            System.out.print(letters);
        }

        System.out.println("");
        //Using charAt to fill one by one each character into the array

        String[] theArray = new String[word.length()];

        for(int i=0; i<word.length(); i++){

            theArray[i] = String.valueOf(word.charAt(i));
        }

        System.out.println(Arrays.deepToString(theArray));

        System.out.println("printing using arrays.toString" + Arrays.toString(theArray));
    }
}
