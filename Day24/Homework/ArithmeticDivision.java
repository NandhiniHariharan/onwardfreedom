package Day24.Homework;
import java.util.Scanner;
public class ArithmeticDivision {
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= sca.nextInt();
        System.out.print("Enter the second number: ");
        int b= sca.nextInt();
        sca.close();
        try{
            int division= a/b;
            System.out.println("Division is: "+division);
        }catch(ArithmeticException V){
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}
