import java.sql.Array;

public class ArrayChange {


    /**You are given an array of integers. On each move you are allowed to increase exactly
     one of its element by one.Find the minimal number of moves required
     to obtain a strictly increasing sequence from the input.

Example
For inputArray = [1, 1, 1], the output should be
solution(inputArray) = 3.

     */


    public static void main(String[] args) {

        int array[] = {3122, -645, 2616, 13213, -8069};

        System.out.println(count(array));

    }

    public static int count(int [] numbers){
        int count=0;

            for(int i=1; i<numbers.length; i++ ){
                while(numbers[i]<=numbers[i-1]){
                    numbers[i]=numbers[i]+1;
                    count++;
                }
            }
        return count;
    }
}
