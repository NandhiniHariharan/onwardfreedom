package Day5;
import java.util.Scanner;
public class log {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.print("Enter a integer: ");
        int n=scanner.nextInt();
        int result=0;
        int i=n;
        while(i>1){
            i/=2;
               result++;
        }
       System.out.print("log2^"+n+"="+result);
        }
}
