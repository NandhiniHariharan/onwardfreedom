package Day5;

import java.util.Scanner;

public class exponential {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int a= 1;
        for(int i=0;i<n;i++){
          a*=2; 
          
        }
        
        System.out.println("2^" +n+ " = " +a);
       
    }
}
