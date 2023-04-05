package arithmeticpackage.arithmetic;

interface AddInterface{
    float add(float a,float b);
}
public class Addition implements AddInterface {
    @Override
    public float add(float a,float b) {
        return a+b;
    }
}
