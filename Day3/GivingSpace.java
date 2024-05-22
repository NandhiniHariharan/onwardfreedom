package Day3;

import java.util.Scanner;

public class GivingSpace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.println("Enter the positive integer");
        int N=scanner.nextInt();
        for(int i=1;i<=N;i++){
             System.out.println(" ");
            System.out.println(i+"");
             System.out.println(" ");
        } 
    }
}
