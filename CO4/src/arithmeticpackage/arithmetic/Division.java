package arithmeticpackage.arithmetic;
import arithmeticpackage.*;
interface DivInterface{
    float div(float a,float b);
}
public class Division implements DivInterface {

    @Override
    public float div(float a,float b) {
        return a/b;
    }
}