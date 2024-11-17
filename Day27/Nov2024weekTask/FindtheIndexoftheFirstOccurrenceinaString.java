package Day27.Nov2024weekTask;
import java.util.Scanner;
public class FindtheIndexoftheFirstOccurrenceinaString {
    public int findingIndex(String heystack,String needle){
       int index=heystack.indexOf(needle);
       return index;
    }
    public static void main(String[] args) {
      Scanner sca=new Scanner(System.in);
      System.out.print("Enter the heystack: ");
      String heystack=sca.nextLine();
      System.out.print("Enter the needle: ");
      String needle=sca.nextLine();
      FindtheIndexoftheFirstOccurrenceinaString finds=new FindtheIndexoftheFirstOccurrenceinaString();
      System.out.println(finds.findingIndex(heystack, needle));
    }
}
