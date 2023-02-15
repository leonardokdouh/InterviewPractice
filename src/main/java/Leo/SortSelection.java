package Leo;

import java.util.Arrays;

public class SortSelection {


    public static void main(String[] args) {
        int [] myDisorderNumbers = { 2, 10, 4, 12, 1};
        System.out.println(Arrays.toString(orderedNumbers(myDisorderNumbers)));
    }

    public static int [] orderedNumbers( int [] some){

            for (int i=0; i<some.length-1; i++){
                int min = some[i];
                int minorIndex=i;
                for(int j = i+1; j<some.length; j++){
                    if(some[j]<min){
                        min = some [j];
                        minorIndex=j;
                    }
                }
                some [minorIndex]= some[i];
                some[i]= min;
            }
        return some;
    }

}
