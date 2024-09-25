package Day21.SimpleProgram;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the input: ");
    int a=sc.nextInt();
    double d=sc.nextDouble();
    sc.nextLine();
    String st=sc.nextLine();
    System.out.println("String: "+st);
    System.out.println("Double: "+d);
    System.out.println("Integer: "+a);

    }
    
}
