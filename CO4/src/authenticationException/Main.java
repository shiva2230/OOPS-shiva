package authenticationException;

import java.util.Scanner;

class InvalidCredException extends Exception {
    public InvalidCredException() {
        super();
    }
}
class Credentials{
    void validate(String username,String password){
        if(!username.equals("admin")||!password.equals("admin")){
            try {
                throw new InvalidCredException();
            }
            catch (Exception e){
                System.out.println("Invalid Credentials");
            }
        }
        else {
            System.out.println("Successfully logged in..");
        }
    }
}
public class Main  {
    public static void main(String[] args) throws InvalidCredException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username: ");
        String username=sc.next();
        System.out.println("Enter password: ");
        String password= sc.next();
        Credentials credentials=new Credentials();
        credentials.validate(username,password);
    }
}
