package averageException;

import java.util.Scanner;

class NegativeValueException extends Exception{
    public NegativeValueException(String msg){
        super(msg);
    }
}
class Function{
    void findAverage(){
        float sum=0,avg=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many numbers to find average of: ");
        int n= sc.nextInt();
        System.out.println("Enter the numbers :");

        for (int i=0;i<n;i++){
            float num=sc.nextInt();
            if (num<0){
                try {
                    throw new NegativeValueException("Only postive values allowed...Try Again !!");
                }
                catch (NegativeValueException e){
                    System.out.println("NegativeValueException: "+ e.getMessage());
                    i--;
                }
            }
            else {
                sum+=num;
                avg=sum/n;
            }

        }
        System.out.println("Average = "+avg);
    }
}
public class Main {
    public static void main(String[] args)  {
        Function function =new Function();
        function.findAverage();
    }
}
