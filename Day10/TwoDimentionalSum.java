public class TwoDimentionalSum {
    public static void main(String[] args) {
        int[] input={4,5,7,-1,6,9};
        int[][] input1={
        {1, 4},
        {3, 5},
        {2, 4}    
        };
        for(int i=0;i<input1.length;i++){
            int[] box=input1[i];
            System.out.print(box[0]+" ");
            System.out.println(box[1]+" ");
            int n=box[0];
            int m=box[1];
            int sum=0;
            for(int j=n;j<=m;j++){
                sum=sum+input[j];
            }
            System.out.println(sum);
        }
        
        
    }
    
}
