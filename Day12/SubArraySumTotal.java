package Day12;

public class SubArraySumTotal {
    public static void main(String[] args) {
        int[] input={2,3,6,7};
        int sum=0;
        int total=0;
        for(int i=0;i<input.length;i++){
            for(int j=i;j<input.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+input[k];
                    System.out.print(input[k]);
                }
                System.out.print("->"+sum);
                System.out.println();
                total+=sum;
            }
             System.out.println();
            
        }
       System.out.print(total);
    }
}
