package publisherBook;

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

        String publisher="McGrew-Hill Education";

    public String getPublisher() {
        return publisher;
    }

    String bookName,author,genre;
    float price;

}

class Literature extends Book{

    public Literature(){
        super();
    }
 void add(){
        Book book=new Book();
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
        System.out.println("Publisher = "+getPublisher());
    }

}

class Fiction extends Book{

    public Fiction(){
        super();
    }
void add(){

    bookName="Harry Potter : Order of the pheonix";
    author="J.K Rowling";
    genre="Fiction";
    price=1000;
}
    void  display(){
        System.out.println("Book name = "+bookName);
        System.out.println("Author = "+author);
        System.out.println("Genre = "+author);
        System.out.println("Price = "+price);
        System.out.println("Publisher ="+getPublisher()+"\n");

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            System.out.println("Enter your choice: ");
            System.out.println("1.Display all Literature books\n2.Display all fiction books\n0.Exit");
            choice = sc.nextInt();
            switch (choice) {


                case 1:
                    Literature literature = new Literature();
                    literature.add();
                    literature.display();
                    break;

                case 2:
                    Fiction fiction = new Fiction();
                    fiction.add();
                    fiction.display();
                    break;

                case 3:
                    System.out.println("Exiting...\n");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 0);

    }



}
