package Day25.LeetCode;
import java.util.Scanner;
public class PalindromeNumber{
   public boolean isPalindrome(int x){
    if(x<0) return false;
    String str=Integer.toString(x);
    int left=0;
    int right=str.length()-1;
    while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;

   }
   public static void main(String[] args) {
    Scanner sca=new Scanner(System.in);
    System.out.println("Enter the palindorme number: ");
    int x=sca.nextInt();
    PalindromeNumber palindromeNumber=new PalindromeNumber();
    System.out.println(palindromeNumber.isPalindrome(x));
    sca.close();
   }

}