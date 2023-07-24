package CompareHashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> hashSet1 = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();

        System.out.println("Enter elements for HashSet 1 (Type 'done' to stop): ");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            hashSet1.add(input);
        }

        System.out.println("Enter elements for HashSet 2 (Type 'done' to stop): ");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            hashSet2.add(input);
        }

        Boolean isEqual = hashSet1.equals(hashSet2);
        System.out.println("Are the two hashsets similar: " + isEqual);

        scanner.close();
    }
}