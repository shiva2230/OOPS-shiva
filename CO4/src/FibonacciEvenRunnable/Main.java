package FibonacciEvenRunnable;
import java.util.Collection;


class Fibonacci implements Runnable{
    @Override
    public void run() {
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}

class Even implements Runnable{
    @Override
    public void run() {
        int r1 = 1,r2 = 10;
        for (int i=r1;i<=r2;i++){
            if (i%2==0) {
                System.out.println("Even number: "+i);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Runnable fibonacci= new Fibonacci();
        Runnable even=new Even();
        Thread t1=new Thread(fibonacci);
        Thread t2=new Thread(even);
        t1.start();
        t2.start();
    }
}
