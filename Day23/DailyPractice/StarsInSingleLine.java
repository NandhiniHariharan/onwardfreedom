package Day23.DailyPractice;
import java.util.Scanner;

public class StarsInSingleLine {
    public static void main(String args[]){
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N=sca.nextInt();
        for(int i=1;i<=N;i++){
            System.out.print(" * ");
        }
        sca.close();
    }
}
