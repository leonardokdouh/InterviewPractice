import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*

Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

 */

public class reverseStringInParentensis {

    public static void main(String[] args) {
        String words = "HelloWorld(ThisAnother(lowestParentesis))";
        System.out.println(solution(words));

    }

    public static String solution (String inputString){
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while (str.indexOf("(") != -1) {
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start + 1, end)).reverse().toString());
        }
        return str.toString();
    }
}
