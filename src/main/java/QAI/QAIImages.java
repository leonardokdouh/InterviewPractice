package QAI;

import java.util.Arrays;

public class QAIImages {

        public static void main(String[] args) {
            int[][] test = {{1, 1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 0, 0, 0, 1},
                            {1, 1, 1, 0, 0, 0, 1},
                            {1, 1, 1, 1, 1, 1, 1}};
            int[] result = solution(test);
            Arrays.stream(result).forEach(pos -> {
                System.out.println(pos);
            });

        }
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
