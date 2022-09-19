import java.util.Scanner;

public class ParallelogramArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a<=0 || b<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else {

            System.out.println(areaCalculator(a, b));
        }
    }
    static int areaCalculator(int a, int b){
    return a*b;
    }
}
