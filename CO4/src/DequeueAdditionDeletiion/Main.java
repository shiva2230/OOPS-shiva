package DequeueAdditionDeletiion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();
        System.out.println("Dequeue before deletion");
        deque.addFirst("Shiva");
        deque.add("Amjad");
        deque.addLast("Nidal");
        Iterator iterator=deque.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Deque after deletion");
        deque.removeFirst();
    }
}
