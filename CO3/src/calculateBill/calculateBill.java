package calculateBill;

import java.util.Scanner;

class CalculateBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many items in the bill: ");
        int n=sc.nextInt();
        Bill[] bill=new Bill[n];
        Bill bill1=new Bill();

        for (int i=0;i<bill.length;i++){
            System.out.println("Enter the details: "+(i+1));
            System.out.println("----------------------");
            System.out.println("Enter product id: ");
            int prodId=sc.nextInt();
            System.out.println("Enter product name: ");
            String prodName=sc.next();
            System.out.println("Enter the quantity: ");
            int quantity=sc.nextInt();
            System.out.println("Enter price: ");
            float price=sc.nextFloat();
            bill[i]=new Bill(prodId,prodName,quantity,price);
            System.out.println("---------------------");
        }
        bill1.netAmount(bill);
        bill1.display(bill);
    }
}
interface Calculate{
    void netAmount(Bill[] bill);
}
class Bill implements Calculate{
    float net=0;
    float total;
    int prodId;
    String prodName;
    int quantity;
    float price;

    public Bill( int prodId, String prodName, int quantity, float price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.quantity = quantity;
        this.price = price;
    }

    public Bill(){

    }
@Override
    public void netAmount(Bill[] bill){

        for (int i=0;i<bill.length;i++){
            bill[i].total=bill[i].price*bill[i].quantity;
            net=net+bill[i].total;
        }
    }

    void display(Bill[] bill){
        System.out.println("Order no : 001");
        System.out.println("Date : 20/3/2023");
        System.out.println("--------------------------");
        System.out.println("Product Id\tName\tQuantity\tUnit Price\tTotal");
        System.out.println("--------------------------");
        for (int i=0;i<bill.length;i++){
            System.out.println(bill[i].prodId+"\t"+bill[i].prodName+"\t"+bill[i].quantity+"\t"+bill[i].price+"\t"+bill[i].total);
            System.out.println("-----------------------------");
        }
        System.out.println("Net Amount: "+net);
        System.out.println("--------------------------------");
    }

}
