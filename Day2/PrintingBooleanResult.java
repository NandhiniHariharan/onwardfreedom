import java.util.Scanner;

public class PrintingBooleanResult {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        System.out.println("Number1 is: "+n1);
        System.out.println("Number2 is: "+n2);
        System.out.println("Number3 is: "+n3);
        System.out.println("(n1<n2) condition is: "+(n1<n2));
        System.out.println("(n2==n3) condition is: "+(n2==n3));
        System.out.println("(n1<n2) && (n2==n3) condition is: "+((n1<n2) && (n2==n3)));
        
    }
}
