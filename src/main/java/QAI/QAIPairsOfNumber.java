package QAI;

import java.util.Arrays;

/**
 * A function called pairs() takes an array, for example [3,1,8].
 * It should return all pairs, e.g. for mentioned example: [[3,1],[3,8],[1,8]].
 * Implement it please y que devuelva todos los pares posta.
 *
 **/


public class QAIPairsOfNumber {


    public static void main(String[] args) {

         ordersPairsNumber(new int[]{2, 4, 5});

    }



    public static int[][]  ordersPairsNumber(int [] inputArray){

        int filas = (int) ((Math.pow(inputArray.length, 2) - inputArray.length) / 2);
        int[][] outputArray = new int[filas][2];
        int indiceUno = 0;
        for (int i = 0; i < inputArray.length; i++){
            for (int j = i + 1; j < inputArray.length; j++){
                outputArray[indiceUno][0] = inputArray[i];
                outputArray[indiceUno][1] = inputArray[j];
                indiceUno++;
            }
        }

        System.out.println(Arrays.deepToString(outputArray));
        return outputArray;
    }




}
