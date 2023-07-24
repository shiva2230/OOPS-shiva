package DequeueAdditionDeletiion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<>();

        System.out.println("Enter elements for the Deque (Type 'done' to stop): ");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            deque.add(input);
        }

        System.out.println("Deque before deletion: ");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Deque after deletion: ");
        deque.removeFirst();

        iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}