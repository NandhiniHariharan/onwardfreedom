import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int N =scanner.nextInt();
        if(N%2==0){
           if(N>0){
               System.out.println("Even positive");
           }else{
           System.out.println("Even negative");
           }
        }else{
            if (N>0){
                System.out.println("Odd positive");
            }else{
                System.out.println("odd negative");
            }
        }
        
    }
}
