package Day23.DailyPractice;

import java.util.Scanner;

public class NtoOne {
    public static void main(String args[]){
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N=sca.nextInt();
        for(int i=N;i>=1;i--){
            System.out.println(i);
        }
        sca.close();
    }
}
