package Day6;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the n:");
        int n=scanner.nextInt();
        int[] givenArr={31,54,55,66,77};
        for(int k=0;k<n;k++){
            int temp=givenArr[0];
            for(int i=0;i<=(givenArr.length-2);i++){
                givenArr[0]=givenArr[i+1];
                givenArr[i+1]=temp;
                temp=givenArr[0];
                
            }
        }
        for(int i=0;i<givenArr.length;i++){
            System.out.print(givenArr[i]+" ");
        }
    
}
}