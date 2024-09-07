package Day18.revision;

public class Book {
    public String Title;
    public String author;
    public int price;
    public static void main(String agrs[]){
        Book book1=new Book();
        Book book2= new Book();
        Book book3=new Book();
        book1.Title="Hover";
        book1.author="John";
        book1.price=25;
        book2.Title="The horror";
        book2.author="Nidhi Upadhyay";
        book2.price=30;
        book3.Title="It Ends With Us";
        book3.author="Colleen Hoover";
        book3.price=50;
        System.out.println("Title is: "+book1.Title);
        System.out.println("Author is: "+book1.author);
        System.out.println("Price is:$ "+book1.price);
        System.out.println();
        System.out.println("Title is: "+book2.Title);
        System.out.println("Author is: "+book2.author);
        System.out.println("Price is:$ "+book2.price);
        System.out.println();
        System.out.println("Title is: "+book3.Title);
        System.out.println("Author is: "+book3.author);
        System.out.println("Price is:$ "+book3.price);
    }
}
