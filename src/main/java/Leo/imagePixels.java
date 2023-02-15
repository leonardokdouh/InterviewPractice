package Leo;

import java.util.Arrays;

public class imagePixels {
//The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way:
//Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3
//square that has its center at x, including x itself. All the pixels on the border of x are then removed.
//Return the blurred image as an integer, with the fractions rounded down.

//image = [[3, 2, 1],  Expected result: [[2]] porque (3+2+1) / 3 = 2


    public static void main(String[] args) {
        int [][] image = {{7, 4, 0, 1},
                         {5, 6, 2, 2},
                         {6, 10, 7, 8},
                        {1, 4, 2, 0}};
        System.out.println(Arrays.deepToString(solution(image)));
    }

     public static int[][] solution(int[][] image) {
        int[][] result = new int[image.length-2][image[0].length-2];
        for (int i = 0; i < image.length-2; i++) {
            for (int j = 0; j < image[i].length-2; j++) {
                result[i][j] = avg(image, i, j);
            }
        }
        return result;
    }
    public static int avg(int[][] image, int x, int y) {
        int sum = 0;
        for (int i = x; i <= x+2; i++) {
            for (int j = y; j <= y+2; j++) {
                sum += image[i][j];
            }
        }
        return sum / 9;
    }


}
