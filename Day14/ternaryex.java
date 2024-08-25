package Day14;
import java.util.Scanner;
public class ternaryex {
    public static void main(String args[]){
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter the Two integer: ");
          int n=scanner.nextInt();
          int n2=scanner.nextInt();
       int  greatest = (n>n2)?n:n2;
       System.out.println( " Greatest Number is: "+greatest);
    }
}
