package Day21.SimpleProgram;
import java.util.Scanner;
public class SimpleMath {
        public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);
            int n=scanner.nextInt();
            for(int i=1;i<=10;i++){
                int result=n*i;
                System.out.println(n+" x "+i+" = "+result);
            }
        }
    }

