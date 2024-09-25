package Day21.SimpleProgram;

import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
    Scanner sca=new Scanner(System.in);
    System.out.println("Enter the integer: ");
    int n=sca.nextInt();
    if(n % 2 ==1){
        System.out.println("Weird");
    }
    else{
         if(n>=2 && n<=5){
        System.out.println("Not Weird");
    }
    else if(n>=6 && n<=20){
        System.out.println("Weird");
    }
    else{
        System.out.println("Not Weird");
    }
    }
   
    }
} 
