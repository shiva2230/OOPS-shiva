package graphicsmain.graphics;

interface CircleInterface{
    void area(float r);
}
public class Circle implements  CircleInterface{
    @Override
    public void area(float r) {
        System.out.println("Area of circle = "+ Math.PI*r*r);
    }
}
