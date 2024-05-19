import java.util.Scanner;

public class FourLessThanEqualTo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.print("Enter the Integer: ");
        int N=scanner.nextInt();
        int i=4;
        while(N>=i) {
            System.out.println(i+"");
            i=i+4;
        }
        
        
  }
}
