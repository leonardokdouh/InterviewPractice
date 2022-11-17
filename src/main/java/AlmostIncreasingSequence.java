 public class AlmostIncreasingSequence {

     /**
      * Given a sequence of integers as an array, determine whether it is
      * possible to obtain a strictly increasing sequence by removing no
      * more than one element from the array.
      *
      * Note: sequence a0, a1, ..., an is considered to be a
      * strictly increasing if a0 < a1 < ... < an. Sequence containing only
      * one element is also considered to be strictly increasing.
      */

    public static void main(String[] args) {
        int [] sequence ={1, 2, 4, 1};

        System.out.println(solution(sequence));
    }


   public static boolean solution(int[] sequence) {
        int count = 0;
        for (int i = 0; i < sequence.length -1; i++) {
            if (sequence[i] >= sequence[i+1]){
                count ++;
            } if (i +2 < sequence.length && sequence[i] >= sequence[i+2]){
                if(i - 1 >= 0 && sequence[i-1] >= sequence[i+1]){
                    return false;
                }
            }
        }
        return (count <= 1);
    }
}
