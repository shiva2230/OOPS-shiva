package ArrayListBuiltInOperations;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        System.out.println("Enter names for list1 (Type 'done' to stop): ");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            list1.add(input);
        }

        System.out.println("List1: " + list1);

        System.out.println("Enter names for list2 (Type 'done' to stop): ");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            list2.add(input);
        }

        System.out.println("List2: " + list2);


        list1.addAll(list2);


        System.out.println("Combined List: " + list1);


        System.out.println("\nEnter the name to add at a specific index: ");
        String nameToAdd = scanner.nextLine();
        System.out.println("Enter the index where you want to add the name: ");
        int indexToAdd = scanner.nextInt();
        list1.add(indexToAdd, nameToAdd);


        System.out.println("Updated List: " + list1);


        System.out.println("\nEnter the index to remove an element: ");
        int indexToRemove = scanner.nextInt();
        list1.remove(indexToRemove);


        System.out.println("Final List: " + list1);

        Boolean isEmpty = list1.isEmpty();
        System.out.println("Is the list empty: " + isEmpty);

        scanner.close();
    }
}
