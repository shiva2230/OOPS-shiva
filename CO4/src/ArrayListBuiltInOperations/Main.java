package ArrayListBuiltInOperations;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list1=new ArrayList<>();

        list1.add("Shiva");
        list1.add("Fayaz");
        list1.add("Amjad");
        list1.add("Nidal");

        System.out.println(list1);

        ArrayList<String> list2=new ArrayList<>();

        list2.add("Raiz");
        list2.add("Alan");
        list2.add("PP");
        list2.add("Alan");

        System.out.println(list2);

        list1.addAll(list2);

        System.out.println(list1);

        System.out.println("\nAdding elements at specific index : ");
        list1.add(3,"Jithin");

        System.out.println(list1);

        System.out.println("\nRemoving elements from a specific index");
        list1.remove(4);

        Boolean isEmpty=list1.isEmpty();
        System.out.println("Is the list empty : "+isEmpty);



    }
}
