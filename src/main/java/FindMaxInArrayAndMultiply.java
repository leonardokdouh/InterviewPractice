import java.util.*;

public class FindMaxInArrayAndMultiply {

    int solution(int[] inputArray) {
        List<Integer> theList = new ArrayList<Integer>();

        int j = position(inputArray);

        if (inputArray[j] * inputArray[j - 1] > inputArray[j] * inputArray[j + 1]) {
            return inputArray[j] * inputArray[j - 1];
        } else {
            return inputArray[j] * inputArray[j + 1];
        }
    }
        public int position ( int[] inputs){
            int j = 0;
            for (int i = 0; i<inputs.length-1; i++) {
                if (inputs[i] > inputs[i + 1]) {
                    j = i;
                }
            }
            return j;
        }

//
// if(j==0 || j==inputArray.length-1){
//        if(j==0){
//            return inputArray[j]*inputArray[j+1];
//        }else{
//            return inputArray[j]*inputArray[j-1];
//        }
//    }else{
//        if(inputArray[j]*inputArray[j-1]>inputArray[j]*inputArray[j + 1]){
//            return inputArray[j] * inputArray[j - 1];
//        } else {
//            return inputArray[j] * inputArray[j + 1];
//        }
//    }
}
