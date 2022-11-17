import java.util.ArrayList;
import java.util.List;

public class CommonCharactersInStrings {

    public static void main(String[] args) {
    String firstWord = "hellooo";
    String secondWord= "helo";


        System.out.println(solution(firstWord, secondWord));
    }


    public static Integer solution(String s1, String s2) {

        int count=0;

        List<String> myList = new ArrayList<String>();
        for (int i=0; i<s2.length(); i++){
            myList.add(String.valueOf(s2.charAt(i)));
        }
        for(int i=0; i<s1.length(); i++){
            if(myList.contains(String.valueOf(s1.charAt(i)))){
                myList.remove(String.valueOf(s1.charAt(i)));
                count++;
            }
        }
        return count;
    }
}
