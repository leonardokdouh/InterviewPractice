package strings;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {


        String word = "helloWorld";

        StringBuilder asd = new StringBuilder(word);

        System.out.println(asd.reverse());

        for(int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));

        }

    }
}
