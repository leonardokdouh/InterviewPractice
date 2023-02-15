package Leo;

import java.util.HashMap;
import java.util.Map;

public class palindrome {

    /**
    A palindrome its a word that you can read it from left to right and vice versa
     */


    //COMMENTS

    //You can't use 1 hashMap because its not possible to save repeated characters.
    //  example not working = neuquen and neuqeen
    //ONLY WAY: using two maps <Integer, CHaracter> with the equals method at the end
    public static void main(String[] args) {

        String one = "menen";
        System.out.println("Esto es MENEN");
        System.out.println(isPalindrome(one));
        System.out.println(isPalHashMap(one));
        System.out.println(one.charAt(0));

        String two = "neuquen";
        System.out.println("Esto es neuquen");
        System.out.println(isPalindrome(two));
        System.out.println(isPalHashMap(two));
    }
    public static boolean isPalindrome (String word){
        //i will put everything in lower case. Because an Upper Case letter will return false
        word.toLowerCase();

        //Now, i will compare the first Vs the last letter word.lenght-1 (because i will get a excep)
        for (int i=0 ; i<word.length(); i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)) return false;
        }
        return true;
    }


    public static boolean isPalHashMap(String word){
        //i will put everything in lower case. Because an Upper Case letter will return false
        word.toLowerCase();  //recibo MENEM -----> al reves en un getvalue(i) vs word.charAt(i)

        //I can create two maps, overload reading normal and from the end to beginning.
        Map<Integer, Character> wordMap = new HashMap<>();
        Map<Integer, Character> reverseMap = new HashMap<>();

        for (int i=0; i<word.length(); i++){
            wordMap.put(i, word.charAt(i));
            reverseMap.put(i, word.charAt(word.length()-1-i));
        }
        return wordMap.equals(reverseMap);
    }

}
