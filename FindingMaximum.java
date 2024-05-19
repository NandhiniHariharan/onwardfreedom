
    import java.util.Scanner;
public class FindingMaximum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the A,B & C");
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int C=scanner.nextInt();
        if (A>=B && A>=C){
              System.out.println("A is Maximum element");
            }else if (B>=A && B>=C){
              System.out.println("B is Maximum element");
            }else{
                System.out.println("C is Maximum element");
            }
    }
}
