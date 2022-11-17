package QAI;

/**
 *
 * The task is simple: Print integers one-to-N, but print “Fizz” if an integer
 * is divisible by three, “Buzz” if an integer is divisible by
 * five, and “FizzBuzz” if an integer is divisible by both three and five.
 *
 */


public class QAIFizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(30);
    }


    public static void fizzBuzz(int number){

        for (int i=1; i<=number; i++){
            if(i%3==0 || i%5==0){
                if(i%3==0) System.out.print(" "+"Fizz");
                if(i%5==0) System.out.print(" "+"Buzz ");
            }else {
                System.out.print( " "+i);
            }
            if(i%5==0){
                System.out.println("");
            }
        }

    }



}
