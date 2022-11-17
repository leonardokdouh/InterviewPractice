import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveOnlyOne {

    public static void main(String[] args) {

        LinkedList<Integer> theLinked = new LinkedList<>();


        theLinked.add(1);
        theLinked.add(4);
        theLinked.add(7);
        System.out.println(theLinked.get(0));
        System.out.println(theLinked.listIterator(0).next());


    }


}