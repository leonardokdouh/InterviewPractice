package Leo;

import java.util.Arrays;

public class pairsNumbers {
    /**
     * A function called pairs() takes an array, for example [3,1,8,].
     * It should return all pairs, e.g. for mentioned example: [[3,1],
     *                                                          [3,8],
     *                                                          [1,8]].
     **/

    public static void main(String[] args) {

        int [] numbs = {2, 5, 6};

        System.out.println(Arrays.deepToString(thePairs(numbs)));
    }

    //all the combs will be  (lenght**2 - length)/2
    public static int[][] thePairs(int[] numbers) {

        // Since we need the rows of the matrix, we need to calculate:
        int rows = ((numbers.length*numbers.length)-numbers.length) /2;

        //now i can create the matriz with rows and 1;
        int[][] pairs = new int[rows][2];

        for (int i = 0, line =0; i < numbers.length-1; i++ ) {
            for (int j = i+1; j < numbers.length; j++) {
                pairs[line][0]= numbers[i];
                pairs[line][1]= numbers[j];
                line++;
            }
        }
        return pairs;
    }
}
