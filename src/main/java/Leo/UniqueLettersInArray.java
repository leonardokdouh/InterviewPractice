package Leo;

import java.util.HashSet;
import java.util.Set;

public class UniqueLettersInArray {


    public static void main(String[] args) {

        String inputEqual = "lovemybird";
        String notEqual = "notlove";

        System.out.println(areUnique(inputEqual));
        System.out.println(areUnique(notEqual));


    }


    public static boolean areUnique(String input) {
        Set mySet = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            mySet.add(input.charAt(i));
        }
        return (mySet.size() == input.length());
    }
}
