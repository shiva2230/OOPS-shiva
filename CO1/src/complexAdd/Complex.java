package complexAdd;


import java.util.*;

class Results{
    int r3,c3;
    void add(int r1,int r2, int c1, int c2){
        r3 = r1 + r2;
        c3 = c1 + c2;
    }
    void display(){
        System.out.println("The summation of two complex numbers:"+r3+"+"+c3+"i");
    }
}

public class Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first real number");
        int r1 = sc.nextInt();
        System.out.println("Enter the first complex number");
        int c1 = sc.nextInt();
        System.out.println("Enter the second real number");
        int r2 = sc.nextInt();
        System.out.println("Enter the second complex number");
        int c2 = sc.nextInt();
        System.out.println("The first complex number: "+r1+"+"+c1+"i");
        System.out.println("The second complex number: "+r2+"+"+c2+"i");
        Results res = new Results();
        res.add(r1,r2,c1,c2);
        res.display();
    }
}