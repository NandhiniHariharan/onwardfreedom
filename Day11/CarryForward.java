package Day11;

public class CarryForward {
    public static void main(String[] args) {
        int[] input={9,3,2,4,3,9,2,2,5,2};
        int a=9,b=2;
        int runningCount=0,totalCount=0;
        for(int i=0;i<input.length;i++){
            if(input[i]==a){
                runningCount++;
            }
            if (input[i]==b){
                totalCount+=runningCount;
            }
            }
         System.out.println("Total pairs is:"+totalCount);
       
    }
}
