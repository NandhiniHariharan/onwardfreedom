package Day22;
import java.util.Scanner;
public class Phalindorme {
    public static void main(String ags[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input=scanner.nextLine();
        System.out.println("You Entered: "+input);
        scanner.close();
        boolean itIsPhalindorme=true;
        for(int i=0;i<input.length();i++){
        if(i>input.length()-(i+1)){
           break;
        }
        if(input.charAt(i)!=input.charAt(input.length()-(i+1))){
            itIsPhalindorme=false;
            break;
        }
        }
        if(itIsPhalindorme==true){
            System.out.println("It is a Phlaindorme");
        }else{
            System.out.println("It is not a Phlaindorme");
        }
    }
    
}
