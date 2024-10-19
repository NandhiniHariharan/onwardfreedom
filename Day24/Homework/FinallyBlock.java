package Day24.Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= sca.nextInt();
        System.out.print("Enter the second number: ");
        int b=0;
        try{
            b= sca.nextInt();
            int division= a/b;
            System.out.println("Division is: "+division);
        }catch(ArithmeticException V){
            System.out.println("Error: Cannot divide by zero!");
        }catch(InputMismatchException I){
            System.out.println("Error: Please enter valid integers!");
        }
        sca.close();
    }
}
