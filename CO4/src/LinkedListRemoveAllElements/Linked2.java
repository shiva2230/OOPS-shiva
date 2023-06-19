package LinkedListRemoveAllElements;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked2 {
    public static void main(String[] args) {
        LinkedList<String> linked= new LinkedList<String>();
        linked.add("one");
        linked.add("two");
        linked.add("three");
        linked.add("four");
        Iterator itr=linked.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator itr2=linked.iterator();

        linked.removeAll(linked);
        System.out.println("Total elements: ");
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
