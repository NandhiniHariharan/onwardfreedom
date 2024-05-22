import java.util.Scanner;
public class FindingGreatestNumber{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the A&B");
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        if(A>B){
           System.out.println("A is the greatest number is: "+A);
        }else{
           System.out.println("B is the Greatest number is: "+B);
        }
        
    }
}