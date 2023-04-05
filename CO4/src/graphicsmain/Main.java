package graphicsmain;

import graphicsmain.graphics.Circle;
import graphicsmain.graphics.Rectangle;
import graphicsmain.graphics.Square;
import graphicsmain.graphics.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter which shapes' area you want to find : ");
            System.out.println("1.Square\n2.Rectangle\n3.Triangle\n4.Circle");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the side: ");
                    float side = sc.nextFloat();
                    Square square = new Square();
                    square.area(side);
                    break;
                case 2:
                    System.out.println("Enter the length and breadth of the rectangle: ");
                    float length = sc.nextFloat();
                    float breadth = sc.nextFloat();
                    Rectangle rectangle = new Rectangle();
                    rectangle.area(length, breadth);
                    break;
                case 3:
                    System.out.println("Enter the height of the triangle: ");
                    float base = sc.nextFloat();
                    float height = sc.nextFloat();
                    Triangle triangle = new Triangle();
                    triangle.area(base, height);
                    break;
                case 4:
                    System.out.println("Enter the radius of the circle : ");
                    float radius = sc.nextFloat();
                    Circle circle = new Circle();
                    circle.area(radius);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice...");
            }
        } while (choice != 0);
    }
}
