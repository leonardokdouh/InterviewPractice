import java.util.Arrays;

public class IsLucky {

    /*
    Ticket numbers usually consist of an even number of digits.
    A ticket number is considered lucky if the sum of the first half
    of the digits is equal to the sum of the second half.
Given a ticket number n, determine if it's lucky or not.
     */
    public static void main(String[] args) {
        int number = 1230;
        int numb= 1233;
        System.out.println(isLuky(number));

        System.out.println(findingIntLenght(numb));
    }

    public static boolean isLuky(int n){

        String tempNumber = Integer.toString(n);
        boolean lucky;
        int mid = tempNumber.length()/2;
        int left=0;
        int right = 0;

        for (int i=0; i<=mid-1; i++){
            left+= Integer.parseInt(String.valueOf(tempNumber.charAt(i)));
        }

        for(int i=mid; i<tempNumber.length(); i++){
            right += Integer.parseInt(String.valueOf(tempNumber.charAt(i)));
        }

        lucky =(right==left)? true: false;

        return lucky;
    }


    public static int findingIntLenght(int a){
        int count =0;

        while (a !=0){
            a= a/10;
            count++;
        }

        return count;
    }
}
