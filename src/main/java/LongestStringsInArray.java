/*Given an array of strings, return another
array containing all of its longest strings.
 */

import java.util.Arrays;

public class LongestStringsInArray {
    public static void main(String[] args) {


        Arrays.stream(solution()).forEach(word-> System.out.println(word));

    }

    public static String[] solution(){

        String[] inputArray = {"asd", "asdasdd", "asdasd", "asdasd"};
        int bigger = 0;
        int size = 0;
        int pos = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > bigger) {
                bigger = inputArray[i].length();
            }
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == bigger) {
                size++;
            }
        }
        String[] bigArray = new String[size];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == bigger) {
                bigArray[pos] = inputArray[i];
                pos++;
            }
        }
        return bigArray;
    }
}
