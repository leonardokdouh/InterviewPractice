package QAI;

import java.util.Arrays;

public class QAIAnagramNumb2 {
    public static void main(String[] args) {

        String line = "231 546 123 456 231 312 4556 ";
        String[] numbersArray = line.split(" ");

        int[] test = {231, 546, 123, 456, 231, 312, 4556};
        multipleAnagrams(numbersArray);
    }

    public static boolean isAnagram(String firstNumber, String secondNumber) {
        char[] firstNumberAux = firstNumber.toCharArray();
        char[] secondNumberAux = secondNumber.toCharArray();
        Arrays.sort(firstNumberAux);
        Arrays.sort(secondNumberAux);
        return (Arrays.equals(firstNumberAux, secondNumberAux));
    }

    public static void multipleAnagrams(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (isAnagram(inputArray[i], inputArray[j])) {
                    System.out.println(inputArray[i] + " and " + inputArray[j] + " are anagrams.");
                } else {
                        System.out.println(inputArray[i] + " and " + inputArray[j] + " are not anagrams.");

                    }
                }
            }
        }

}
