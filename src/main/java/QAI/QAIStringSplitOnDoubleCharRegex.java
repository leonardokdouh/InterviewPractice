package QAI;

/**
 * Given a string , split it when it encounters a specific char repeatedly
 * and return both lengths
 * Example :   given    asdfasdfJJasdfasdfasdf
 * Output:     asdfasdf         asdfasdfasdf
 *
 */

public class QAIStringSplitOnDoubleCharRegex {

    public static void main(String[] args) {

        String regex = "([a-ZA-A])\\1";
        String regex2 = "\\([^()]+\\)\n";


    }

    public static int[] lenghts(String word){

        int left = 0;
        int right=0;

        for(int i=0; i<word.length()-1; i++){
            if(word.charAt(i)==word.charAt(i+1)){
                left= i;
                right=word.length()-left-2;
            }
        }
        System.out.println(left);
        System.out.println(right);
        return new int[]{left, right};
    }



}
