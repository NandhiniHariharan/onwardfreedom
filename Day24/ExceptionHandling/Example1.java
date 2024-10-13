import java.util.InputMismatchException;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int a=0;
        int b=0;
        int division=0;
            try{
                try{
                    a=sca.nextInt();
                    b=sca.nextInt();
                }catch(InputMismatchException i){
                    System.out.print("-1");
                }
                try{
                    division=a/b;
                }catch(ArithmeticException j){
                    System.out.println("-2");
        }
    }catch(Exception e){
        System.out.println("-3");
    }
        System.out.println(division);
    }

}
