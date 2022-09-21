package strings;

import javax.swing.*;
import java.util.*;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        List<Character> theList = new ArrayList<>();
        List<Character> secondList = new ArrayList<>();
        for (char ch : a.toLowerCase().toCharArray()) {
            theList.add(ch);
        }
        for (char ch : b.toLowerCase().toCharArray()) {
            secondList.add(ch);
        }
        if (secondList.size() != theList.size()) {
            return false;
        } else {
            for (int j = 0; j < theList.size(); j++) {
                for (int k = 0; k < secondList.size(); k++) {
                    if (theList.get(j) == secondList.get(k)) {
                        secondList.remove(k);
                        break;
                    }
                }
            }
        }
        System.out.println(theList.size());
        System.out.println(secondList.size());
        if (secondList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

        public static void main (String[]args){

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        }


}