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
    String bookName,author,genre;
    float price;
    Publisher publisher;

    public Book(Publisher publisher,String bookName,String author,String genre,float price){
        this.publisher=publisher;
        this.bookName=bookName;
        this.author=author;
        this.genre=genre;
        this.price=price;
    }


}

class Literature extends Book{

    public  Literature(Publisher publisher,String bookName,String author,String genre,float price){
        super(publisher, bookName, author, genre, price);
    }

}

class Fiction extends Book{

    public Fiction(Publisher publisher, String bookName, String author, String genre, float price) {
        super(publisher, bookName, author, genre, price);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Publisher publisher1=new Publisher(" Macmillan Publishers","New York City, USA");
        Publisher publisher2=new Publisher("McGraw-Hill Education","New York, USA");
        System.out.println("Enter your choice: ");
        System.out.println("1.Add new Book\n2.Display all books\n0.Exit");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the details: ");
                System.out.println("--------------------");
                System.out.println("Enter the book name: ");
                sc.next();
                System.out.println("Enter the author name: ");
                sc.next();
                System.out.println("Enter the genre:");
                System.out.println("1.Literature\n2.Fiction");

                switch (choice){
                    case 1:
                }
        }



    }



}
