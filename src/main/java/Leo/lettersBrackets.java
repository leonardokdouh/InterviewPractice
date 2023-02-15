package Leo;

/**
 * 3. Given this input: "3[asd]" you have to generate an output string: asdasdasd
 * # Q1
 * ## input => "2[asd]"
 * ## output => "asdasdasd"
 * # Q2
 * ## input => "3[a]4[b]"
 * ## output => "aaabbbb"
 * # Q3
 * ## input => "3[a2[b]]"
 * ## interim output => "3[abb]"
 * ## output => "abbabbabb" (edited)
 */

public class lettersBrackets {

    public static void main(String[] args) {

        String input = "2[asd]";
        String inputTwo = "2[a]2[b]";
        String inputTwoMore = "21[a]22[b]";
        String lauchi = "10[a1[b]]";
        String inputThree = "asd2[a]2[b2[c]]";

        System.out.println(lettersMultipliedI(input));

        System.out.println(lettersMultiplieII(inputTwo));
        System.out.println(lettersMultiplieII(inputTwoMore));
        System.out.println(lettersMultiplieII(inputThree));
    }

    public static String lettersMultipliedI(String input) {
        //for this first case i will use 2 indexes because i will need to get
        //the opening and closing brackets.
        int open = input.indexOf("[");
        int close = input.indexOf("]");
        //now i have to multiply what is inside the open and close, with the number
        String middleWord = input.substring(open + 1, close);

        return middleWord.repeat(Character.getNumericValue(input.charAt(open - 1)));
    }

    public static String lettersMultiplieII(String input) {
        int open, close;
        String openBracket = "[";
        //For resolving the third case, i just need to change the open integer method.
        // open=input.lastIndexOf(openBracket);
            while (input.contains("[")) {
                open = input.lastIndexOf("[");
                close = input.indexOf("]", open);
                String subs = input.substring(open + 1, close);
                int number = Character.valueOf(input.charAt(open - 1));

                input = input.replace(input.substring(open - 1, close + 1), subs.repeat(number));
            }
            return input;
    }

    public static String moreNumbers(String input) {
        String regForNumber = "[0-9]";
        int open, close, actualPosition;

        while (input.contains("[")) {
            open = input.lastIndexOf("[");
            close = input.indexOf("]", open);

            String subString = input.substring(open+1, close);

            actualPosition = open;

            while (actualPosition>0 && input.substring(actualPosition-1, actualPosition )
                            .matches(regForNumber)){
                actualPosition--;
            }

            Integer repeat = Integer.valueOf(input.substring(actualPosition, open));

            input=input.replace(input.substring(actualPosition, close+1),
                    subString.repeat(repeat));
        }
        return input;

    }

}











































