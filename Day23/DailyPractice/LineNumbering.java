package Day23.DailyPractice;
import java.util.Scanner;

public class LineNumbering {
    public static void main(String args[]){
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        int linenum=1;
    while(sca.hasNext()){
        String line=sca.nextLine();
        System.out.println(linenum+" "+line);
        linenum++;
    }
    sca.close();
    }
}
