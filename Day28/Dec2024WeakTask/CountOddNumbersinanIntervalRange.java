package Day28.Dec2024WeakTask;

public class CountOddNumbersinanIntervalRange {
    public int countodd(int low,int high){
        int N=(high-low + 1);
        if(N%2==0){
            N=N/2;
        }
        else if(low%2==0){
            N=N/2;
        }
        else{
            N=N/2+1;
        }
        return N;
    }
    public static void main(String[] args) {
        int low=1;
        int high=8;
        CountOddNumbersinanIntervalRange count=new CountOddNumbersinanIntervalRange();
        System.out.println(count.countodd(low, high));
    }
}
