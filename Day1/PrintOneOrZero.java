import java.util.Scanner;

public class PrintOneOrZero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Integer");
        int N=scanner.nextInt();
        
        if(N%2==0){
          System.out.println("0");
        }else{
            System.out.println("1");
        }
        
    }
}
    

