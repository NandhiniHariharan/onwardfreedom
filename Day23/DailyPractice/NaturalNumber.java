package Day23.DailyPractice;
import java.util.Scanner;
public class NaturalNumber {
    public static void main(String args[]){
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sca.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        sca.close();
    }
}
