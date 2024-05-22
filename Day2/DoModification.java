package Day2;
import java.util.Scanner;

public class DoModification {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int X=scanner.nextInt();
        X*=5;
        System.out.println("X five times greater than the original value is: "+X);
        System.out.println();
        X+=10;
        System.out.println("Increment the value of X by 10 is: "+X);
        System.out.println();
        X/=2;
        System.out.println("Divide the value of X by 2 is: "+X);
        System.out.println();
        
        System.out.println("The final value of X is: "+X);
    }
}
