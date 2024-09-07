package Day17;

public class BookDetails {
String author;
String title;
int price;
public BookDetails(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
}

public void setDetails(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
}
public void display(){
System.out.println("Title: "+title);
System.out.println("Author Name: "+author);
System.out.println("Price: "+price);
}
public void applyDiscount(int discount){
price-=price*(discount/100);
}
public  static void main(String args[]){
BookDetails book=new BookDetails("Never Come Back","Harry", 29 );
book.display();
book.applyDiscount(10);
System.out.println("After Discount:");
book.display();
}
}