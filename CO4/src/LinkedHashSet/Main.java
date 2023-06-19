package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("chair");
        linkedHashSet.add("Pen");
        linkedHashSet.add("Apple");
        Iterator iterator=linkedHashSet.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
    }
}
