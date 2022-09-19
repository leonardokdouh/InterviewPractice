import java.io.File;
import java.util.Scanner;

public class EndOfFile {

    /**
     The challenge here is to read N lines of input until you reach EOF,
     then number and print all N lines of content.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count =1;

            while (scan.hasNextLine()){
                System.out.println(count +" "+ scan.nextLine());
                count++;
            }
    }
    }

