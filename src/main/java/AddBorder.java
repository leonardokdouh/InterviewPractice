import java.util.Arrays;

public class AddBorder {

    public static void main(String[] args) {

        String [] picture = {"abc", "ded"};


        Arrays.stream(solution(picture)).forEach(word-> System.out.println(word));



    }

    public static String[] solution(String[] picture) {
        int rows = picture.length;
        String[] result = new String[rows + 2];
        String regex = "[a-zA-Z*]+";
        String regex2 = "[a-zA-Z*]";
        for (int i = 0; i < result.length; i++){
            if (i == 0 || i == result.length -1){
                result[i] = "*" + picture[0].replaceAll(regex2, "*") + "*";
            }else{
                result[i] = picture[i-1].replaceAll(regex, "*"+picture[i-1]+"*");
            }
        }
        return result;
    }


}
