public class HigherProductInArray {
    public static int solution(int[] inputArray) {
        int result=0;
        for (int i = 0; i<inputArray.length-1; i++) {
            if (inputArray[i]*inputArray[i+1]>result) {
                result= inputArray[i]*inputArray[i + 1];
                System.out.println(result);

            }
        }
        return result;
    }
}
