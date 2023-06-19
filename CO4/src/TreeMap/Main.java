package TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> hashMap=new HashMap<>();
        System.out.println("Adding elements in HashMap");
        hashMap.put("Amjad",79);
        hashMap.put("Shiva",19);
        hashMap.put("Nidal",66);
        hashMap.put("Fayaz",36);
        hashMap.put("Shiva",7);
        for (Map.Entry<String,Integer> m:hashMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Converting to TreeMap");
        TreeMap<String,Integer> treeMap=new TreeMap<>();
        treeMap.putAll(hashMap);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
