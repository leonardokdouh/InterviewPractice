package strings;

public class Palindrome {

    public boolean solution(String inputString) {

        boolean flag=true;
        int j=inputString.length()-1;

        for (int i=0; i<inputString.length(); i++){
            if(inputString.charAt(i)!=inputString.charAt(j)){
                flag= false;
                break;
            }
            j--;
        }
        return flag;
    }
}
