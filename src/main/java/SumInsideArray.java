import java.util.Arrays;


/**
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 **/
public class SumInsideArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3,4};

        System.out.println(numbers.length);

        System.out.println(Arrays.toString(runningSum(numbers)));
    }

    static int[] runningSum(int[] nums) {
        int[] sums =new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sums[i]= (i==0) ? nums[i] : (nums[i]+sums[i-1]);
        }
        return sums;
    }
}

