package WorkingOfMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        System.out.println("Adding elements");
        map.put(1,"Shiva");
        map.put(2,"Nidal");
        map.put(3,"Amjad");
        map.put(4,"Fayaz");
        map.put(5,"Shiva");
        for (Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(" After Changing : ");
        map.replace(5,"PP");
        for (Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("After removing : ");
        map.remove(5);
        for (Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
