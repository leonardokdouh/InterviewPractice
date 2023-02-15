package Leo;


/**
 *
 * The task is simple: Print integers one-to-N, but print "Fizz" if an integer
 * is divisible by three, "Buzz" if an integer is divisible by
 * five, and "FizzBuzz" if an integer is divisible by both three and five.
 *
 */


public class fizzBuzz {

    public static void main(String[] args) {
       // fizBuz1(100);
        fizBuzAppend(15);
    }

    public static void fizBuz1 (int number){

        for (int i=1; i<=number; i++){
            if (i%3==0 & i%5==0) System.out.println("FizzBuzz");
            else if(i%3==0) System.out.println("Fizz");
            else if (i%5==0) System.out.println("Buzz");
            else System.out.println(i);

        }
    }

    public static void fizBuzAppend( int number){
        for (int i=1; i<=number; i++){
            StringBuilder stringBuilder = new StringBuilder();
            if(i%3==0) stringBuilder.append("Fizz");
            if (i%5==0) stringBuilder.append("Buzz");
            System.out.println( i + " = " +stringBuilder);
        }
    }

}
