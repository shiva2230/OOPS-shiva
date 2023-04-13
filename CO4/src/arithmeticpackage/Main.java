package arithmeticpackage;

import arithmeticpackage.arithmetic.Addition;
import arithmeticpackage.arithmetic.Division;
import arithmeticpackage.arithmetic.Multiplication;
import arithmeticpackage.arithmetic.Subtraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a,b;
        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            System.out.println("Enter your choice : ");
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n0.Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter two numbers: ");
                    a=sc.nextFloat();
                    b=sc.nextFloat();
                    Addition addition=new Addition();
                    System.out.println("Sum = "+addition.add(a,b));
                    break;
                case 2:
                    System.out.println("Enter two numbers: ");
                    a=sc.nextFloat();
                    b=sc.nextFloat();
                    Subtraction subtraction= new Subtraction();
                    System.out.println("Difference = "+subtraction.sub(a,b));
                    break;
                case 3:
                    System.out.println("Enter two numbers: ");
                    a=sc.nextFloat();
                    b=sc.nextFloat();
                    Multiplication multiplication=new Multiplication();
                    System.out.println("Product = "+multiplication.mul(a,b));
                    break;
                case 4:
                    System.out.println("Enter two numbers: ");
                    a=sc.nextFloat();
                    b=sc.nextFloat();
                    Division division=new Division();
                    System.out.println("Quotient = "+division.div(a,b));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
