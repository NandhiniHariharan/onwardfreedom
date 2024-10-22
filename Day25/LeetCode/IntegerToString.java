package Day25.LeetCode;
import java.util.Scanner;
public class IntegerToString {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int n=sca.nextInt();
        sca.close();
        String i=Integer.toString(n);
        if(i.equals(Integer.toString(n))){
            System.out.println("Good Job");
        }else{
            System.out.println("Wrong Answer");
        }
    }
}
