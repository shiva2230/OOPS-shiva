package LinkedListRemoveAllElements;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> linked = new LinkedList<String>();

        System.out.println("Enter elements for the LinkedList (Type 'done' to stop): ");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            linked.add(input);
        }

        System.out.println("Original LinkedList elements: ");
        Iterator<String> itr = linked.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        linked.removeAll(linked);

        System.out.println("Total elements after removal: ");
        Iterator<String> itr2 = linked.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        scanner.close();
    }
}
