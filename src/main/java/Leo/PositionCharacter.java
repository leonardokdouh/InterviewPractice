package Leo;

import java.util.HashMap;
import java.util.Map;

public class PositionCharacter {

    /**
     * Devolver las posiciones en las que aparece cada letra de un string.
     * */



public static void main(String [] args){

    String word = "asdasdlgk";
    wordsPositions(word);
}


public static void wordsPositions(String input){
    char [] inputChar = input.toCharArray();

    Map<Character, String> positions = new HashMap<>();

    for(int i = 0; i<inputChar.length; i++){
        if(positions.containsKey(inputChar[i])){
            positions.put(inputChar[i], positions.get(inputChar[i]) + " " + i);
        }else {
            positions.put(inputChar[i], String.valueOf(i));
        }
    }
    System.out.println(positions);

    for (Map.Entry let : positions.entrySet()){
        System.out.println("The character: "+ let.getKey() + " is on positions: " + let.getValue());

    }

}
}
