
package Day24.Homework;
import java.util.Scanner;
public class Operation {
    public static void performOperation(int num1,int num2) throws ArithmeticException,IllegalArgumentException{
        if(num2==0){
           throw new ArithmeticException();
        }
        if(num1<0 || num2<0){
            throw new IllegalArgumentException();
        }
        int result=num1/num2;
        System.out.println("Result is: "+result);
    }
   
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sca.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sca.nextInt();
        try{
            performOperation(num1, num2);
        }catch(ArithmeticException A){
            System.out.println("Error: Division by zero is not allowed.");
        }catch(IllegalArgumentException i){
            System.out.println("Error: Numbers cannot be negative.");
        }
       
    }
}
