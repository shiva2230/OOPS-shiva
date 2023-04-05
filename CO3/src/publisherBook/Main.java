package publisherBook;

import javax.crypto.interfaces.PBEKey;
import java.util.Scanner;

class Publisher{
    String name;
    String address;

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Book{

        String publisher="McGraw-Hill Education";



    String bookName,author,genre;
    float price;




}

class Literature extends Book{

    public Literature(String Publisher){
        super();
    }
 void add(){
        Book book=new Book();
        bookName="To kill a mockingbird";
        author="Harper Lee";
        genre="Literature";
        price=500;
        //String publisher=book.getPublisher;
 }
    void  display(){
        System.out.println("Book name = "+bookName);
        System.out.println("Author = "+author);
        System.out.println("Genre = "+author);
        System.out.println("Price = "+price);
    }

}

class Fiction extends Book{

    public Fiction(){
        super();
    }

//    public Fiction(Publisher publisher, String bookName, String author, String genre, float price) {
//        super(publisher, bookName, author, genre, price);
//    }
void add(){

    bookName="To kill a mockingbird";
    author="Harper Lee";
    genre="Literature";
    price=500;
}
    void  display(){
        System.out.println("Book name = "+bookName);
        System.out.println("Author = "+author);
        System.out.println("Genre = "+author);
        System.out.println("Price = "+price);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your choice: ");
        System.out.println("1.Display all Literature books\n2.Display all fiction books\n0.Exit");
        int choice=sc.nextInt();
        switch (choice){
            case 1:

                switch (choice){
                    case 1:
                }
        }



    }



}
