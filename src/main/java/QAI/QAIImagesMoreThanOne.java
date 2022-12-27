package QAI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QAIImagesMoreThanOne {

        public static void main(String[] args) {
            int[][] test = {{1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 0, 0, 0, 1}, {1, 1, 1, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1, 1}};
            int[][] test2 = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 0, 0, 1, 1, 0, 1}, {1, 1, 1, 0, 0, 0, 1, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1}};
            List<Integer[]> result = solution2(test2);
            for (Integer[] asd: result){
                System.out.println(Arrays.deepToString(asd));
            }

        }
        //Contempla varios rectangulos en la matriz
        public static List<Integer[]> solution2(int[][] inputArray){
            List<Integer[]> result = new ArrayList<>();
            for (int i = 0; i < inputArray.length; i ++){
                for (int j = 0; j < inputArray[0].length; j++){
                    if (inputArray[i][j] == 0){
                        Integer[] aux = new Integer[4];
                        aux[0] = i;
                        aux[1] = j;
                        int auxIndexColumna = j;
                        while (auxIndexColumna < inputArray[0].length && inputArray[i][auxIndexColumna] == 0){
                            auxIndexColumna++;
                        }
                        int auxIndexFilas = i;
                        while (auxIndexFilas < inputArray.length && inputArray[auxIndexFilas][auxIndexColumna - 1] == 0){
                            auxIndexFilas++;
                        }
                        aux[2] = auxIndexFilas - 1;
                        aux[3] = auxIndexColumna - 1;
                        result.add(aux);
                        //fila2-4  colum3-5
                        for (int k = aux[0]; k < aux[2] + 1; k++){
                            for (int l = aux[1]; l < aux[3] + 1; l++){
                                inputArray[k][l] = 2;
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

