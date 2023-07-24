package WorkingOfMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();

        System.out.println("Adding elements to the map (Type '-1' for key to stop): ");
        int key;
        String value;
        while (true) {
            System.out.print("Enter key: ");
            key = scanner.nextInt();
            if (key == -1) {
                break;
            }
            System.out.print("Enter value: ");
            value = scanner.next();
            map.put(key, value);
        }

        System.out.println("Elements in the map: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("Enter key to change the value: ");
        int keyToChange = scanner.nextInt();
        if (map.containsKey(keyToChange)) {
            System.out.println("Enter new value: ");
            String newValue = scanner.next();
            map.replace(keyToChange, newValue);
        } else {
            System.out.println("Key not found in the map.");
        }

        System.out.println("Elements in the map after changing: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("Enter key to remove entry: ");
        int keyToRemove = scanner.nextInt();
        if (map.containsKey(keyToRemove)) {
            map.remove(keyToRemove);
        } else {
            System.out.println("Key not found in the map.");
        }

        System.out.println("Elements in the map after removing: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        scanner.close();
    }
}
