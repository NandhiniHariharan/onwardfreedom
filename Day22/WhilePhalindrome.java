package Day22;
import java.util.Scanner;

public class WhilePhalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input=scanner.nextLine();
        System.out.println("You Entered: "+input);
        scanner.close();
        boolean itIsPhalindorme=true;
        int i=0;
        while(i<input.length()-(i+1)){
            if(input.charAt(i)!=input.charAt(input.length()-(i+1))){
                itIsPhalindorme=false;
                break;
            }
            i++;
            }
        
        if(itIsPhalindorme == true){
            System.out.println("It is a Phlaindorme");
        }else{
            System.out.println("It is not a Phlaindorme");
        }
    }
}