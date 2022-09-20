package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String regex = in.nextLine();
        try{
            Pattern.compile(regex);
            System.out.println("Valid");
            String word = in.nextLine();
            System.out.println(word.matches(regex));
        }
            catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        testCases--;
        }
    }
}
