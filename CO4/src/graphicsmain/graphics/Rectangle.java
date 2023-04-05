package graphicsmain.graphics;

interface RectangleInterface{
    void area(float l,float b);
}
public class Rectangle implements  RectangleInterface {
    @Override
    public void area(float l,float b) {
        System.out.println("Area of rectangle = " + (l*b));
    }
}
