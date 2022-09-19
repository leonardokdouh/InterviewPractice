import java.util.HashMap;
import java.util.Map;

/**
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving
the order of characters. No two characters may map to the same character,
but a character may map to itself.
 */


public class IsomorphicString {

    public static void main(String[] args) {
        System.out.println(isoMorph("add", "egg"));
        System.out.println(isoMorphTwo("egg", "put"));

    }

    static boolean isoMorph(String one, String two) {

        Map<Character, Character> mapita = new HashMap<>();
        boolean flag = true;

        for (int i = 0; i < one.length(); i++) {
            Character charAsd1 = one.charAt(i);
            Character charAsd2 = two.charAt(i);
            if (mapita.containsKey(charAsd1) || mapita.containsValue(charAsd2)) {
                if (mapita.get(charAsd1) != charAsd2) {
                    flag = false;
                }
            } else {
                mapita.put(charAsd1, charAsd2);
            }
        }
        return flag;
    }

    static boolean isoMorphTwo(String s, String t) {
        char[] aux1 = new char[256];
        char[] aux2 = new char[256];
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (aux1[sChar] == 0 && aux2[tChar] == 0) {
                aux1[sChar] = tChar;
                aux2[tChar] = sChar;
            } else if (aux1[sChar] != tChar) {
                flag= false;
            }
        }
        return flag;
    }
}
