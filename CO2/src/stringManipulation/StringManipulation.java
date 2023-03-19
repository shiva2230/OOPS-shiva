package stringManipulation;


import java.util.Scanner;
class StringFunction {
    Scanner sc=new Scanner(System.in);
    String str,strJoin;
    String repl;
    String replWith;
    void uppercase(){
        System.out.println("Enter the word:");
        str=sc.next();
        System.out.println("Word after conversion to uppercase: "+str.toUpperCase());
    }

    void lowercase(){
        System.out.println("Enter the word:");
        str=sc.next();
        System.out.println("Word after conversion to lowercase: "+str.toLowerCase());
    }

    void replace() {

        System.out.println("Enter the words: ");
        str = sc.nextLine();
        System.out.println("Enter which word you want to replace");
        repl = sc.nextLine();
        System.out.println("Enter which word you want to replace with");
        replWith = sc.nextLine();
        System.out.println("After replacing: "+ str.replaceAll(repl,replWith));
    }

    void findLength(){
        System.out.println("Enter the word to find the length: ");
        str=sc.nextLine();
        System.out.println("Length of the word: "+str.length());
    }

    void joinWord(){
        System.out.println("Enter the word : ");
        str=sc.nextLine();
        System.out.println("Enter the word to join it with: ");
        strJoin=sc.nextLine();
        System.out.println("Word after joining: "+ String.join(" ",str,strJoin));
    }
}


public class StringManipulation {
    public static void main(String[] args) {
        int choice;
        Scanner sc= new Scanner(System.in);
        StringFunction stringFunction=new StringFunction();
        do {
            System.out.println("Choose which string function to perform:");
            System.out.println("1. Change all characters to uppercase \n2. Change all characters to lowercase \n3. Replace word \n4. Find the length \n5. Join word \n0. Exit ");
            choice=sc.nextInt();


            switch (choice){
                case 1:
                    stringFunction.uppercase();
                    break;
                case 2:
                    stringFunction.lowercase();
                    break;
                case 3:
                    stringFunction.replace();
                    break;
                case 4:
                    stringFunction.findLength();
                    break;
                case 5:
                    stringFunction.joinWord();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice !!");

            }
        }while (choice!=0);
    }
}


