package Day20.NesedClasses;

public class Library {
    class Book{
    public String author;
    public String title;
    public void displayDetails(){
         this.author="Hover";
         this.title="The Life";
         System.out.println(this.author);
         System.out.println(this.title);
    }
    }
    public static void main(String[] args) {
        Library book=new Library();
    }
}
