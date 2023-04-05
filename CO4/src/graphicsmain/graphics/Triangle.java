package graphicsmain.graphics;
interface TriangleInterface{
    void area(float b,float h);
}
public class Triangle implements  TriangleInterface {
    @Override
    public void area(float b,float h) {
        System.out.println("Area of triangle  = " + 0.5*b*h);
    }
}
