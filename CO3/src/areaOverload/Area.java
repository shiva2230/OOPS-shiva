package areaOverload;

import java.util.Scanner;

class AreaFunction {

    void area(int a){
        int area;
        area=a*a;
        System.out.println("Area of square = "+area+"\n");
    }
    void area(int l,int b){
        int area;
        area=l*b;
        System.out.println("Area of rectangle ="+area+"\n");
    }
    void area(double r){
        double area;
        area=Math.PI*r*r;
        System.out.println("Area of circle = "+area+"\n");
    }

    void area(double b,double h){
        double area;
        area=0.5*b*h;
        System.out.println("Area of triangle = "+area+"\n");
    }

}


class Area {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        AreaFunction areaFunction=new AreaFunction();
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1.Area of Square\n2.Area of triangle\n3.Area of rectangle\n4.Area of Circle\n0.Exit");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the side");
                    int side=sc.nextInt();
                    areaFunction.area(side);
                    break;

                case 2:
                    System.out.println("Enter the base of the triangle: ");
                    double base=sc.nextDouble();
                    System.out.println("Enter the height of the triangle: ");
                    double height=sc.nextDouble();
                    areaFunction.area(base,height);
                    break;

                case 3:
                    System.out.println("Enter the length of the rectangle: ");
                    int length=sc.nextInt();
                    System.out.println("Enter the breadth of the rectangle: ");
                    int breadth=sc.nextInt();
                    areaFunction.area(length,breadth);
                    break;

                case 4:
                    System.out.println("Enter the radius of the circle: ");
                    double radius=sc.nextDouble();
                    areaFunction.area(radius);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice!=0);
    }
}

