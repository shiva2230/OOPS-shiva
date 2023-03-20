package areaPerimeterInterface;

import java.util.Scanner;

public interface Shapes {
    void area();
    void perimeter();
}
class Circle implements Shapes{
    Scanner sc=new Scanner(System.in);

    double radius;

    @Override
    public void area() {
        System.out.println("Enter the radius");
        radius=sc.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle : "+area);
    }

    @Override
    public void perimeter() {
        System.out.println("Enter the radius");
        radius=sc.nextDouble();
        double peri=2*Math.PI*radius;
        System.out.println("Perimeter of circle : "+peri);
    }
}

class Rectangle implements Shapes{
    Scanner sc=new Scanner(System.in);

   double length;
    double breadth;

    @Override
    public void area() {
        System.out.println("Enter length: ");
        breadth=sc.nextDouble();
        System.out.println("Enter breadth: ");
        length=sc.nextDouble();
        double area=length*breadth;
        System.out.println("Area of rectangle : "+area);
    }

    @Override
    public void perimeter() {
        System.out.println("Enter length: ");
        breadth=sc.nextDouble();
        System.out.println("Enter breadth: ");
        length=sc.nextDouble();
        double peri=2*(length+breadth);
        System.out.println("Perimeter of rectangle : "+peri);
    }
}

class ShapesMain{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        do {

        System.out.println("Enter your choice: ");
        System.out.println("1.Area of Circle\n2.Perimeter of Circle\n3.Area of rectangle\n4.Perimeter of rectangle\n0.Exit the program");
        choice=sc.nextInt();
        switch (choice){
            case 1: circle.area();
                System.out.println();
            break;
            case 2: circle.perimeter();
                System.out.println();
            break;
            case 3: rectangle.area();
                System.out.println();
            break;
            case 4: rectangle.perimeter();
                System.out.println();
            break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice...!");
                break;
        }
        }while (choice!=0);
    }



}
