package BubbleSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int temp;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(56);
        list.add(7);
        list.add(18);
        list.add(23);
        list.add(98);
        System.out.println("unsorted list: "+list);
        for (int i=0;i<list.size()-1;i++){
            for (int j=i+1;j<(list.size()-i-1);j++){
                int num1=list.get(i);
                int num2=list.get(j);
                if (num1>num2){
                    temp=num2;
                    num1=num2;
                    num2=temp;
                }
            }
        }
        System.out.println("sorted list: "+list);

    }

}
