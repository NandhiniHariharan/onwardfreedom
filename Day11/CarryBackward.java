package Day11;

public class CarryBackward {
    public static void main(String[] args) {
        int[] input={9,3,2,4,3,9,2,2,5,2};
        int a=9,b=2;
        int runningCount=0,totalCount=0;
        for(int i=input.length-1;i>=0;i--){
            if(input[i]==b){
                runningCount++;
            }
            if (input[i]==a){
                totalCount+=runningCount;
            }
            }
         System.out.println("Total pairs is:"+totalCount);
       
    }
}
