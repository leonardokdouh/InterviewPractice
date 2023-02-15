package Leo;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class isogram {

    /**
     * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
     * Implement a function that determines whether a string that contains only letters is an isogram.
     * Assume the empty string is an isogram. Ignore letter case.
     */

    public static void main(String[] args) {

        String word = "word";
        //System.out.println(isIsogramSet(word));
        System.out.println(isIsogramMap(word));

    }

    //So, basically if an isogram is a word that have no repetitive letters, i am thinking about  using a Set.
    // This interface contains the methods inherited from the Collection interface
    // and adds a feature that restricts the insertion of the duplicate elements.
    // the same character, if i overloading a Set of characters, and at the end, if the Set has less size than the word,
    // its not an Isogram.
    public static boolean isIsogramSet(String word) {
        Set<Character> myOnlySet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            myOnlySet.add(word.charAt(i));
        }
        return (myOnlySet.size() == word.length());
    }

    //Another approuch will be to overload a map, asking if it contains key, being the individual characters, return false;
    //Here, if the word has no repetitive letters the map will overload with no trouble at all. Otherwise, it will
    //breack the iteration and return false;

    //Why LinkHashMap-- > porque mantiene el insertion order y me pinto.
    public static boolean isIsogramMap(String anotherWord) {
        Map<Character, Integer> myIsoMap = new LinkedHashMap<>();

        for (int i = 0; i < anotherWord.length(); i++) {
            if (myIsoMap.containsKey(anotherWord.charAt(i))) {
                return false;
            } else {
                myIsoMap.put(anotherWord.charAt(i), 1);
            }
        }
        return true;
    }


}
