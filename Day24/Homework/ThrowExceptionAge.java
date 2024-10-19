package Day24.Homework;
import java.util.Scanner;

public class ThrowExceptionAge {
    public static void checkAge(int age) throws AgeException {
        if(age<18){
          throw new AgeException();
        }
        else {
            System.out.println("Age is 18 or above. Access granted.");
        }
    }
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter the age: ");
        ThrowExceptionAge validator =new ThrowExceptionAge();
        int age=sca.nextInt();
        try{
            validator.checkAge(age);
        }catch(AgeException a){
            System.out.println("Error: You must be 18 or older to sign up.");
        }
        sca.close();
        
    }
}
