package Day2;
import java.util.Scanner;

public class FindingTemperature {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Temperature");
        float n=scanner.nextFloat();
        if (n>=85.0 && n<=91.0){
              System.out.println("Serious Hypothermia");
            }else if (n>=91.0 && n<=95.0){
              System.out.println("Mild Hypothermia");
            }else if(n>=95.0 && n<=98.0){
              System.out.println("Normal temperature");
            }else if(n>=98.0 && n<=100.0){
               System.out.println("Mild fever"); 
            }else if(n>=100.0 && n<=105.0){
               System.out.println("High fever"); 
            }else{
                System.out.println("Your temperature is out of range");
            }
    }
}
