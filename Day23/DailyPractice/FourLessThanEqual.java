package Day23.DailyPractice;
import java.util.Scanner;

public class FourLessThanEqual {
    public static void main(String args[]){
       Scanner sca=new Scanner(System.in);
       System.out.println("Enter the Number: ");
       int N=sca.nextInt();
       for(int i=4;i<=N;i++){
        if(i%4==0){
            System.out.println(i+" ");
        }
       }
       sca.close();
    }
}
