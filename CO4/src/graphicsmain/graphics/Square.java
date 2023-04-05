package graphicsmain.graphics;
interface SquareInterface{
    void area(float a);
}
public class Square implements SquareInterface{

    @Override
    public void area(float a) {
        System.out.println("Area of square ="+(a*a));
    }
}
