public class PfArraySum {
    public static void main(String[] args) {
        int[] input={3,5,6,8,9,10};
        int[][] input2={{2,4},
        {3,5}
        };
        int sum=0;
        int[] PF=new int[input.length];
        int lastsum=0;
            for(int i=0;i<input.length;i++){
                if(i==0){
                    lastsum=input[i];
                }else{
                     lastsum=lastsum+input[i];
                }
              PF[i]=lastsum;
            }
            for(int i=0;i<input2.length;i++){
                  int start=input2[i][0];
                  int stop=input2[i][1];
                  sum=PF[stop]-PF[start-1];
                 System.out.print(sum+" ");
              }
            
    }
}
