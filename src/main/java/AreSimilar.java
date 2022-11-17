import java.util.Arrays;

public class AreSimilar {


    /**
     * Two arrays are called similar if one can be obtained
     * from another by swapping at most one pair of elements in one of the arrays.
     * Given two arrays a and b, check whether they are similar.
     **/

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{1, 4, 3, 4, 6, 5};

        System.out.println(solution(a, b));


        AreSimilar asd = new AreSimilar();

        var as2 = 3;



        System.out.println(as2);
    }


    public static boolean solution(int[] first, int[] second) {
        int count = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                count++;
            }
        }
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second) && count < 3;

    }

    
}

