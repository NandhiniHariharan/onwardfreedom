package Day25.LeetCode;

import java.util.Scanner;

public class StringOperation {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes":"No");
        String capitalA=A.substring(0,1).toUpperCase()+A.substring(1);
        String capitalB=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(capitalA+" "+capitalB);
        
    }
}

