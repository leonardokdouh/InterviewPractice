package Leo;

import java.util.Stack;

public class correctOpenAndClose {
    /**
     * String input = "[(]{)}()"
     * see if every time there is open bracket, there is a closed one after,
     * and never a closed one before an open one
     * extra: implement for () too
     */

    public static void main(String[] args) {
        String input = "()[])(";
        String inputTwo = "()[]{(())}{((}";
        String inputThree = "(({[))]}))";
        String inputFour = "{}[]()()";
        String inputFelipe = "{(}[]())()";
        //System.out.println(openAndCloseAll(inputFelipe));

        System.out.println(regexOneChar('(', ')', inputTwo));

    }
    public static boolean openAndCloseAll(String input) {
        if (!(input.length() % 2 == 0)) return false;
        Stack<Character> myStack = new Stack<>();
                    //{(}[]())()
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                myStack.push(x);
                continue;
            }
            if (myStack.empty()) return false;
            switch (x) {
                case ')':
                    if (myStack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (myStack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (myStack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        return (myStack.isEmpty());
    }

    public static boolean justOneChar(char openChar, char closeChar, String input){
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (x == openChar) {
                myStack.push(x);
                continue;
            }
            if(x!=closeChar) continue;
            //so if my x its an
            if (myStack.empty()) return false;
            if ( x== closeChar) myStack.pop();
            }
        return (myStack.isEmpty());
    }


    public static boolean regexOneChar(char openChar, char closeChar, String input){
        Stack<Character> myStack = new Stack<>();
        String regex = ("[^" + openChar  + closeChar +"]");
        String newInput = input.replaceAll(regex, "");
        if (newInput.length() % 2 != 0) return false;

        for (int i=0; i<newInput.length(); i++){
           char actual = newInput.charAt(i);
           if(actual==openChar){
               myStack.push(openChar);
           }else{
               if(myStack.isEmpty()) return false;
               myStack.pop();
           }
        }
        return myStack.isEmpty();
    }
}
