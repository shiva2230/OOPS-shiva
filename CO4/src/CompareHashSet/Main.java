package CompareHashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        HashSet<String> hashSet1=new HashSet<>();
        hashSet1.add("Apple");
        hashSet1.add("Orange");
        hashSet1.add("Grapes");
        hashSet1.add("Apple");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Apple");
        Boolean isEqual= hashSet.equals(hashSet1);
        System.out.println("Is the two hashsets similar: "+isEqual);
    }
}
