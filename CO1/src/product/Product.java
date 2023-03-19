package product;

import java.util.*;

class prod{
    int pcode;
    String pname;
    float price;
    static void checkPrice(prod p1,prod p2,prod p3){
        if(p1.price<p2.price&&p1.price<p3.price){
            System.out.println(p1.pname+" has"+ " lower price");
            System.out.println("product code: "+p1.pcode);
            System.out.println("price: "+ p1.price);
        }
        else if(p2.price<p1.price&&p2.price<p3.price){
            System.out.println(p2.pname+" has"+ " lower price");
            System.out.println("product code: "+p2.pcode);
            System.out.println("price: "+ p2.price);
        }
        else{
            System.out.println(p3.pname+" has"+ " lower price");
            System.out.println("product code: "+p3.pcode);
            System.out.println("price: "+ p3.price);
        }
    }
}



public class Product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        prod p1=new prod();
        System.out.print("Enter the Product 1 code: ");
        p1.pcode=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the product 1 name: ");
        p1.pname=sc.nextLine();
        System.out.print("Enter product 1 price: ");
        p1.price=sc.nextInt();
        sc.nextLine();
        System.out.println("----------------------------");


        prod p2=new prod();
        System.out.print("Enter the Product 2 code: ");
        p2.pcode=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the product 2 name: ");
        p2.pname=sc.nextLine();
        System.out.print("Enter product 2 price: ");
        p2.price=sc.nextInt();
        sc.nextLine();
        System.out.println("----------------------------");


        prod p3=new prod();
        System.out.print("Enter the Product 3 code: ");
        p3.pcode=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the product 3 name: ");
        p3.pname=sc.nextLine();
        System.out.print("Enter product 3 price: ");
        p3.price=sc.nextInt();
        sc.nextLine();
        System.out.println("----------------------------");


        prod.checkPrice(p1,p2,p3);


    }

}
