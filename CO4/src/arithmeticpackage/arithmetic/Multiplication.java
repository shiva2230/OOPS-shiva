package arithmeticpackage.arithmetic;

interface MulInterface{
    float mul(float a,float b);
}
public class Multiplication implements MulInterface {
    @Override
    public float mul(float a,float b) {
        return a*b;
    }
}