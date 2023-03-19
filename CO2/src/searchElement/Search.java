package searchElement;


import java.util.Scanner;

class SearchElement {
    int flag=0,count=0;
    void search(int[] arr,int item,int num){
        for (int i=0;i<=num;i++){
            count++;
            if(arr[i]==item)
            {
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Item found at "+count+" position");

        }
        else {
            System.out.println("Item not found");
        }

    }

}


class Search {
    public static void main(String[] args) {
        int[] arr= new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add");
        int num=sc.nextInt();
        System.out.println("Enter the list of numbers");
        for (int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the item you want to search");
        int item=sc.nextInt();
        SearchElement searchElement= new SearchElement();
        searchElement.search(arr,item,num);
    }
}

