package Day20.NesedClasses;
 class Library {
    class Book{
    public String author;
    public String title;
    public void displayDetails(){
        System.out.println("The author is: "+author);
        System.out.println("The title is: "+title);
    }
    }
    public static void main(String[] args) {
        Library book=new Library();
        Library.Book obj=book.new Book();
        obj.author="Hover";
        obj.title="The Life";
        obj.displayDetails();
    }
}
