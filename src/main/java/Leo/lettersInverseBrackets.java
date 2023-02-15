package Leo;

/**
 * Given a String, you should return another string with the format:
 * x[a]XY[bc]
 * String input = aabbcc , should return 2[a]2[b]2[c]
 **/
public class lettersInverseBrackets {


    public static void main(String[] args) {
        String input = "s";
        String inputTwo = "assbbb";
        System.out.println(inverseStuff(inputTwo));
    }

    public static StringBuilder inverseStuff(String input) {
        //i will create a SB to build step by step the output
        StringBuilder newString = new StringBuilder();
        
        // i will be needing a counter, 
        int counter = 1;
        
        //and my logic will be to compare by 2 letters
        char actualLetter = 0;
        char previousLetter;

        //i will make a for loop from i=1
        for (int i = 1; i < input.length(); i++) {
            previousLetter = input.charAt(i - 1);
            actualLetter = input.charAt(i);
            if (actualLetter != previousLetter) {
                newString.append(counter + "[" + previousLetter + "]");
                counter = 1;
            } else {
                counter++;
            }
        }
        //at the end, i will append the last repetead or not letter
        //because actual = previus.
        newString.append(counter + "[" + actualLetter + "]");

        return newString;
    }

}
