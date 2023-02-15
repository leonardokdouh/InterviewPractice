package Leo;

import java.util.*;

public class anagramsNumeric {

    /**
     * Input:
     * String line = "123 456 231 546 231 312 4556";
     * <p>
     * Output:
     * 123, 231, 231, 312 - are numeric anagrams
     * 456, 546 - are numeric anagrams
     * 4556 - has no anagrams
     **/

    public static void main(String[] args) {
            // First i will create a doble for loop to iterate throw i & j
            // in the j loop i will call some method that will make the check
            // finally print if It's, or it's not anagram.
        String line = "123 456 231 546 312 4556";
        System.out.println("solucion mati");
        solution2(line);
    }

    public static void solution2(String line){
        //First i will split the input so i can work with indexes and save it inside an array
        String[] splitted = line.split(" ");

        //then i create a map<string, string>,  iterate and sort every index so
        // then i can ask if the map contains or not

        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < splitted.length; i++){
            char[] number = splitted[i].toCharArray();
            //After converting the number into a char, i will sort it and then back to string again.
            Arrays.sort(number);
            String sorted = new String(number);

            //NOW i need to ask if the map contains or not the sorted string value.
            //if contains, i will take the value and add the number (the original number) that is anagram to the Key.
            // Else, add the sorted number, and the value
            if(map.containsKey(sorted)){
                String aux = map.get(sorted);
                aux = aux + " "  + splitted[i];
                map.put(sorted,aux);
            }else{
                map.put(sorted,splitted[i]);
            }
        }
        //at the end i will print the values of every key, and then asked: If it has more than 1 value->print Are numeric Anagrams.
        for(String numbers : map.values()){
            System.out.println(numbers);
            if (numbers.split(" ").length>1){
                System.out.print("Are numeric anagrams");
            }else {
                System.out.print("Has no anagrams");
            }
        }
    }

    public static boolean isAnagram (String first, String second){
        char [] firstNumber = first.toCharArray();
        char [] secondNumber = second.toCharArray();
        Arrays.sort(firstNumber);
        Arrays.sort(secondNumber);
        return Arrays.equals(firstNumber, secondNumber);
    }
    public static void anagramNumbers(String number) {

        //i will create a string array with the string number i receive, using split.
        String[] numbers = number.split(" ");

        List <String> anagrams = new ArrayList<>();
        List <String> notAnagrams = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                // Here i will call the method
                if (isAnagram(numbers[i], numbers[j])) {
                    anagrams.add(numbers[i] + " and " + numbers[j]);
                } else {
                    notAnagrams.add(numbers[i] + " and " + numbers[j]);
                }
            }
        }

        System.out.println("the list of angrams" + anagrams);
        System.out.println("the list of not anagrams" + notAnagrams);

    }
    // this method will receive 2 strings (the two numbers to compare).
    //create 1 char array for each one, just to sort them using Arrays.sort
    //finally return using equals.




}
