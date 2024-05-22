package Day4;

import java.util.Scanner;

public class NAndMStars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.print("Enter the N & M: ");
        int N=scanner.nextInt();
        int M=scanner.nextInt();
       
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                System.out.print("* ");
            }
              
             System.out.println();
        }
      
    }
}
