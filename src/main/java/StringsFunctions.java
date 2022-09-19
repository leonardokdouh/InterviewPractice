import java.util.Scanner;

/**
 * 1)
 *This exercise is to test your understanding of Java Strings. A sample String declaration:
 * String myString = "Hello World!"
 * The elements of a String are called characters. The number of characters in a String is called the length,
 * and it can be retrieved with the String.length() method.
 * Given two strings of lowercase English letters, A and B , perform the following operations:
 * Sum the lengths of A and B.
 * Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
 * Capitalize the first letter in A and B  print them on a single line, separated by a space.
 *
 *2)
 *
 * Given a string,s , and two indices, START and END , print a substring consisting of all
 * characters in the inclusive range from  to .
 * You'll find the String class' substring method helpful in completing this challenge.
 *
 * 3) Search the 3 smallest and higher characters on a String
 * Remember: A<Z-.....<a<z
 *
 */
public class StringsFunctions {

    public static void main(String[] args) {

        //upperAndLower();
        System.out.println(getSmallestAndLargest("welcometojava", 3));

    }


    public static void upperAndLower(){

        //1
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) <= 0) {
            System.out.println("No");
        } else System.out.println("Yes");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)
                + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
        //2
        public static void printPartOfString(){
            Scanner in = new Scanner(System.in);
            String S = in.next();
            int start = in.nextInt();
            int end = in.nextInt();

            System.out.println(S.substring(start, end));
        }

        //3
        public static String getSmallestAndLargest(String s, int k) {
            String smallest = s.substring(0, k);
            String largest = s.substring(0, k);

            for (int i=0; i<s.length()-k+1; i++){
                String aux = s.substring(i, k+i);
                if(smallest.compareTo(aux)>0){
                    smallest= aux;
                }
                if(largest.compareTo(aux)<0){
                    largest=aux;
                }
            }
            return smallest + "\n" + largest;
        }


    }

