package matrixAdd;


import java.util.*;


class Add{
    int[][] arr3=new int[2][2];
    void addArray(int[][] arr1,int[][] arr2){

        for(int i1=0;i1<arr1.length;i1++){
            for(int j=0;j<arr2.length;j++){
                arr3[i1][j]=arr1[i1][j]+arr2[i1][j];
            }

        }
    }
    void display(){
        System.out.println("The matrix is:");
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3.length;j++){
                System.out.print(arr3[i][j]+" ");

            }
            System.out.println();

        }

    }

}


public class Matrix {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first array");


        int[][] arr1=new int[2][2];;
        int[][] arr2=new int[2][2];;
        int[][] arr3=new int[2][2];

        for(int i1=0;i1<arr1.length;i1++){
            for(int j=0;j<arr1.length;j++){
                arr1[i1][j]=sc.nextInt();
            }

        }
        System.out.println("Enter second array");
        for(int i1=0;i1<arr2.length;i1++){
            for(int j=0;j<arr2.length;j++){
                arr2[i1][j]=sc.nextInt();
            }

        }

        Add add=new Add();
        add.addArray(arr1,arr2);
        add.display();




    }}

