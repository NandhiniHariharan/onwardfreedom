package Day18.revision;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
    public static void main(String args[]){
        Calculator cal=new Calculator();
        System.out.println("The Addition is: "+cal.add(5,5));
        System.out.println("The Subtrtaction is: "+ cal.subtract(4,2));
        System.out.println("The Multiplication is: "+ cal.multiply(5, 6));
        System.out.println("The Division is: "+ cal.divide(80, 2));
    }
}
