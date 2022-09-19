import java.util.Scanner;

public class PoligonoAscendente {

    public static int poligonoSumatoria() {

        Scanner scann = new Scanner(System.in);


        System.out.println("Put any n numbers");
        int n = scann.nextInt();
        int J = 0;

        for (int i = 1; i <= n; i++) {

            J = (int) (Math.pow(i, 2) + Math.pow(i - 1, 2));

        }
        return J;
    }
}
