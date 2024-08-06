package Day13;
public class Calculator{
    public static int add(int a,int b){
        int add=a+b;
        return add;
    }
    public static int subtract(int a, int b){
        int subtract=a-b;
        return subtract;
    }
    public static int multiply(int a,int b){
        int multiply=a*b;
        return multiply;
    }
    public static double divide(double a, double b){
        double divide=a/b;
        return divide;
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int addition=add(a,b);
        int subtraction=subtract(a,b);
        int multiplying=multiply(a,b);
        double dividing=divide(a,b);
        System.out.println("The add is:"+addition);
        System.out.println("The subtract is:"+subtraction);
        System.out.println("The multiply is:"+multiplying);
        System.out.println("The divide is:"+dividing);
    }
}