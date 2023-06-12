package MultiplicationPrimeThread;


import java.util.Scanner;

class Multiplication extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("5"+"\t"+"*\t"+i+"\t"+"="+"\t"+(5*i));
        }
    }
}
class Prime extends Thread{
    Scanner sc=new Scanner(System.in);
    int n;

//    Prime(int n){
//    this.n=n;
//    }

    @Override
    public void run() {

        n=10;
        int count = 0;
        int number = 2;

        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}

public class Main {
    public static void main(String[] args){
        Prime prime=new Prime();
        prime.start();
        Multiplication multiplication=new Multiplication();
        multiplication.start();
    }

}
