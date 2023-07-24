package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        System.out.println("Enter elements for the LinkedHashSet (Type 'done' to stop): ");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            linkedHashSet.add(input);
        }

        System.out.println("Unique elements in the LinkedHashSet: ");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}