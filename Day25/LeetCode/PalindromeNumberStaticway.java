package Day25.LeetCode;

import java.util.Scanner;

public class PalindromeNumberStaticway {
    public static boolean palindrome(int y){
        if(y<0) return false;
        int original=y;
        int reversed= 0;
        while(y>0){
            int digit=y%10;
            reversed=reversed*10+digit;
            y/=10;
        }
        return original==reversed;
    }
    public static void main(String[] args) {
    Scanner sca=new Scanner(System.in);
    System.out.println("Enter the palindorme number: ");
    int x=sca.nextInt();
    PalindromeNumberStaticway palindromeNumber=new PalindromeNumberStaticway();
    System.out.println(palindromeNumber.palindrome(x));
    sca.close();
    }
}
