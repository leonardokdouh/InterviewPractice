package Leo;

public class SumNumbersOfInt {

    /**
     *  if you have number 15 make 1+5 as output
     */



    public static void main (String [] args){
        int number= 1456;
        System.out.println(addingNumbers(number));

    }


    public static int addingNumbers(int input){
        int aux=0;
        while(input>0){
            aux= aux + input%10;
            input= input/10;
        }
        return aux;
    }

}
