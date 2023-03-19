package stringSort;

import java.util.Arrays;
import java.util.Scanner;

class StringSort {

    void wordSort(String[] word){
        System.out.println("Array before sorting: "+Arrays.toString(word));
        Arrays.sort(word);
        System.out.println("Array after sorting: "+Arrays.toString(word));
    }

}


class Sort {

    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many words you want to input: ");
        n=sc.nextInt();
        String[] str= new String[n];
        System.out.println("Enter the words: ");
        for (int i=0;i<n;i++){
            str[i]=sc.next();
        }
        StringSort stringSort=new StringSort();
        stringSort.wordSort(str);
    }

}

