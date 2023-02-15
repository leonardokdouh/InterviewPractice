package Leo;

/**
Given a 2d array, find the image that is represented by the 0's
 you should return the X-Y position of the first and last 0.

 */


public class images {

    public static void main(String[] args) {

        int[][] test = {{1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 0, 0, 0, 1},
                        {1, 1, 1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1}};
    }

/*
    1)First, if i need to return the position of 2 ceros, i will need a
    4 numbers array, meaning 2 for the first cero and 2 for the last one.
    2) i will create a method to receive the 2D array representing the image.
    3) i will iterate using a doble for to find the first cero, save the x and y
    4) then find the last one and saving it.
    5) finally return the array of 4 numbers that represent all the positions.
 */

    public static int[] solution(int[][] inputArray){
        int[] result = new int[4];
        //0 -> fila posicion 1;
        //1 -> columna posicion 1;
        //2 -> fila posicion 2;
        //3 -> columna posicion 2;
        for (int i = 0; i < inputArray.length; i ++){
            for (int j = 0; j < inputArray[0].length; j++){
                if (inputArray[i][j] == 0){
                    result[0] = i;
                    result[1] = j;
                    while (inputArray[i][j] == 0){
                        j++;
                    }
                    while (inputArray[i][j-1] == 0){
                        i++;
                    }
                    result[2] = i - 1;
                    result[3] = j - 1;
                    return result;
                }
            }
        }
        return result; // aca devolveria solo si no hay ningun 0 en la matriz
    }

}
