package BubbleSort;

import java.util.ArrayList;

public class Main {

    public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> list) {
        int n = list.size();
        T temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                T num1 = list.get(j);
                T num2 = list.get(j + 1);
                if (num1.compareTo(num2) > 0) {
                    temp = num1;
                    list.set(j, num2);
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(56);
        intList.add(7);
        intList.add(18);
        intList.add(23);
        intList.add(98);

        System.out.println("Unsorted list: " + intList);
        bubbleSort(intList);
        System.out.println("Sorted list: " + intList);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("orange");
        strList.add("banana");
        strList.add("pear");
        strList.add("grape");

        System.out.println("Unsorted list: " + strList);
        bubbleSort(strList);
        System.out.println("Sorted list: " + strList);
    }

}
