package calculateBill;

import java.util.Scanner;
import java.time.LocalDate;

class CalculateBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int billCount = 1;

        Bill bill1 = new Bill();
        Bill[][] bill = new Bill[100][100];

        while (true) {
            System.out.println("Enter how many items in the bill: ");
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.println("Bill No. " + (billCount));
                System.out.println("Enter the details: " + (j + 1));
                System.out.println("----------------------");
                System.out.println("Enter product id: ");
                int prodId = sc.nextInt();
                System.out.println("Enter product name: ");
                String prodName = sc.next();
                System.out.println("Enter the quantity: ");
                int quantity = sc.nextInt();
                System.out.println("Enter price: ");
                float price = sc.nextFloat();
                bill[billCount - 1][j] = new Bill(prodId, prodName, quantity, price);
                System.out.println("---------------------");
            }
            System.out.println("Do you want to print another bill: (y/n)");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("n")) {
                break;
            } else {
                billCount++;
            }
        }
        bill1.netAmount(bill, billCount);
        bill1.display(bill, billCount);
    }
}

interface Calculate {
    void netAmount(Bill[][] bill, int billCount);
}

class Bill implements Calculate {
    float[] net = new float[100];
    float total;
    int prodId;
    String prodName;
    int quantity;
    float price;

    public Bill(int prodId, String prodName, int quantity, float price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.quantity = quantity;
        this.price = price;
    }

    public Bill() {

    }

    @Override
    public void netAmount(Bill[][] bill, int billCount) {
        for (int i = 0; i < billCount; i++) {
            for (int j = 0; j < bill[i].length; j++) {
                if (bill[i][j] != null) {
                    bill[i][j].total = bill[i][j].price * bill[i][j].quantity;
                    net[i] += bill[i][j].total;
                }
            }
        }
    }

    void display(Bill[][] bill, int billCount) {
        LocalDate localDate=LocalDate.now();
        for (int i = 0; i < billCount; i++) {
            System.out.println("Order no : "+(i+1));
            System.out.println("Date : "+localDate);
            System.out.println("--------------------------");
            System.out.println("Product Id\tName\tQuantity\tUnit Price\tTotal");
            System.out.println("--------------------------");
            for (int j = 0; j < bill[i].length; j++) {
                if (bill[i][j] != null) {
                    System.out.println(
                            bill[i][j].prodId + "\t" + bill[i][j].prodName + "\t" + bill[i][j].quantity + "\t"
                                    + bill[i][j].price + "\t" + bill[i][j].total);
                    System.out.println("-----------------------------");
                }
            }
            System.out.println("Net Amount: " + net[i]);
            System.out.println("--------------------------------");
        }


    }
}
