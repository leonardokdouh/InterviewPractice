package Leo;

import java.util.ArrayList;
import java.util.List;

public class PictureAsterics {

    public static void main(String[] args) {
        String[] words = {"auto", "casa"};
        String[] wordsInPicture = matrixInPicture(words);
        for (int i = 0; i < wordsInPicture.length; i++) {
            System.out.println(wordsInPicture[i]);
        }

    }

    public static String[] matrixInPicture(String[] matrix) {

        int wordLength = matrix[0].length();
        String rowOfAsterisks = "*".repeat(wordLength + 2);

        List<String> arrayList = new ArrayList<>();
        arrayList.add(rowOfAsterisks);
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = "*" + matrix[i] + "*";
            arrayList.add(matrix[i]);
        }
        arrayList.add(rowOfAsterisks);
        String[] picture = arrayList.toArray(new String[0]);
        return picture;
    }
}
