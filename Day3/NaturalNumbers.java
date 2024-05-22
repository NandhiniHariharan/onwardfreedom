package Day3;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.println("Enter the positive integer");
        int N=scanner.nextInt();
        for(int i=N;i>=1;i--){
             System.out.println(" ");
            System.out.println(i+"");
             System.out.println(" ");
        } 
    }
}
