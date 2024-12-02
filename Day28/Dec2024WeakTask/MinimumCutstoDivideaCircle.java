package Day28.Dec2024WeakTask;

public class MinimumCutstoDivideaCircle {
    public int dividingCricle(int n){
        if (n<=1){
            return 0;
        }
        if(n%2==1){
            return n;
        }
        else{
            n=n/2;
        }
        return n;
    }
    public static void main(String[] args) {
        int n=4;
        MinimumCutstoDivideaCircle mini=new MinimumCutstoDivideaCircle();
        System.out.println(mini.dividingCricle(n));
    }
}
