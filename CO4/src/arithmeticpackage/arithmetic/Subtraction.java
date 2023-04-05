package arithmeticpackage.arithmetic;

interface SubInterface{
    float sub(float a,float b);
}
public class Subtraction implements SubInterface {
    @Override
    public float sub(float a,float b) {
        return a-b;
    }
}
