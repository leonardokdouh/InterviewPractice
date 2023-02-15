package Leo;

import java.util.Arrays;

public class SortInsertion {


    //Insertion sort, compare cic

    public static void main(String[] args) {
        int [] myIntsDisorder = {44, 2, 1, 10, 25};
        System.out.println(Arrays.toString(sortOrder(myIntsDisorder)));
    }

    public static int [] sortOrder(int [] origin){

        for(int i=1; i<origin.length; i++){
            int j = i;
            int aux =0;
            while (j>0 && origin[j]<origin[j-1]){
                aux = origin[j];
                origin[j]= origin[j-1];
                origin[j-1]= aux;
                j--;
            }
        }
        return origin;
    }
}

