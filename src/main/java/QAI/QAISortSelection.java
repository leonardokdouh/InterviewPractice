package QAI;

import java.util.Arrays;

public class QAISortSelection {

    /*
    Some people are standing in a row in a park. There are trees between them which cannot be moved.
    Your task is to rearrange the people by their
    heights in a non-descending order without moving the trees. People can be very tall!
     */

    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 11, 2, 16};

        Arrays.stream(solution(numbers))
                .forEach(word-> System.out.println(word));
    }

    public static int[] solution(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int positionToSwip = i;
            int lower = a[i];

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < lower && a[j] != -1) {
                    lower= a[j];
                    positionToSwip=j;
                }
            }
            int aux = a[i];
            a[i]=lower;
            a[positionToSwip]=aux;
        }
        return a;
    }

}
