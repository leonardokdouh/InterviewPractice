package regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SplittingString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        s= s.trim();
        if(s.length()!=0){
            String[] asd= s.split("[!,?._'@ ]+");

            System.out.println(asd.length);

            for(String spliting: asd){
                System.out.println(spliting);
            }
        }else{
            System.out.println("0");
        }
    }
}