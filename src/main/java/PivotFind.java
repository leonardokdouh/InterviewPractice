import java.util.Arrays;


/**
 Given an array of integers nums, calculate the pivot index of this array.

 The pivot index is the index where the sum of all the numbers strictly
 to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 If the index is on the left edge of the array, then the left sum is 0 because
 there are no elements to the left. This also applies to the right edge of the array.

 Return the leftmost pivot index. If no such index exists, return -1.
 */
public class PivotFind {
    public static void main(String[] args) {

        int array[] = {10, 5, 6, 6, 5, 10};

        System.out.println(isAnyPivot(array));
    }
    public static int isAnyPivot(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            //rightSum = totalSum - leftSum - arr[i];
           if((totalSum-leftSum-arr[i])==leftSum){
               return i;
           }else{
               leftSum += arr[i];
           }
        }
        return index;
    }

}

