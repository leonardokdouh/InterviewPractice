package QAI;

/**
 * 3. Given this input: “3[asdf]” you have to generate an output string: asdfasdfasdf
 * # Q1
 * ## input => “2[asdf]”
 * ## output => “asdfasdf”
 * # Q2
 * ## input => “3[a]4[b]”
 * ## output => “aaabbbb”
 * # Q3
 * ## input => “3[a2[b]]”
 * ## interim output => “3[abb]”
 * ## output => “abbabbabb” (edited)
 */


//PRIMER CASO : saco el while y ya anda

    //SEGUNDO CASO: es asi como esta.
    //3er caso: cambio startIndex=inputString.indexOf (x lastIndexof)
public class QAIMultiplyStringInParentesis {

    public static void main(String[] args) {

    String input = "3[asdf]";
        stringMultiplied(input);
    }

    public static String stringMultiplied(String inputString){

        int startIndex, endIndex, multiplier;
        while (inputString.contains("[")){
            startIndex = inputString.indexOf("[");
            endIndex = inputString.indexOf("]", startIndex);
            multiplier = Character.getNumericValue(inputString.charAt(startIndex - 1));
            String concatString = inputString.substring(startIndex + 1, endIndex);
            System.out.println(concatString);
            inputString = inputString.replace(inputString.substring(startIndex - 1,
                            endIndex + 1),
                    concatString.repeat(multiplier));
            System.out.println(inputString);
        }
        return inputString;
    }




}


