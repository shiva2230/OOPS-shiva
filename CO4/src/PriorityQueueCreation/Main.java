package PriorityQueueCreation;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("Shiva");
        queue.add("Amjad");
        queue.add("Nidal");
        queue.add("Fayaz");
        Iterator iterator=queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
