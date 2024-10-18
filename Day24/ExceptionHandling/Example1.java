import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void validateName(String name) throws MyOwnexception{
     char vowels[]= {'a','e','i','o','u'};
     boolean output=  false;
     for(int i=0;i<vowels.length;i++){
        if(name.charAt(0)==vowels[i]){
          output= true;
          break;
        }
     }
     System.out.println(output);
     if(output == false){
        throw new MyOwnexception();
     }
    }
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int a=0;
        int b=0;
        int division=0;
            MyOwnexception exception=new MyOwnexception();
            try{
                validateName("Nandhini");
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
    }catch(MyOwnexception e){
        System.out.println("-3");
    }
        System.out.println(division);
    }

}
