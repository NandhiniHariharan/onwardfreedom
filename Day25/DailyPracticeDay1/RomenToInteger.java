package Day25.DailyPracticeDay1;
import java.util.HashMap;
import java.util.Scanner;

public class RomenToInteger {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the Romen: ");
        String input=sca.nextLine();
        sca.close();
        int sum=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
}
