package Leo;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementsInArray {

    //return a boolean if all of the elements of the array are unique


    public static void main (String [] args){

    String firstInput = "Hi my name is Leonardo nice to meet you";

    String secondInput = "Hi my name is Ricardito,  my pleasure";

        System.out.println(uniqueWords(firstInput));
        System.out.println(uniqueWords(secondInput));


    }


    public static boolean uniqueWords(String input){

        String [] wordsArray = input.split(" ");

        Set uniques = new HashSet <> ();

        for (int i =0; i<wordsArray.length; i++){
            uniques.add(wordsArray[i]);
        }

        return (uniques.size() ==wordsArray.length);
    }

}
