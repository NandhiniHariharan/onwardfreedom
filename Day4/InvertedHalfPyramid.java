package Day4;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.print("Enter the Integer: ");
        int N=scanner.nextInt();
        
        for(int i=N;i>=1;i--){
        for (int j=1;j<=i;j++) {
            System.out.print("* ");
        }
         System.out.println();
  }
}
}
