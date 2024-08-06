public class FindingPairs {
    public static void main(String[] args) {
        int[] input={9,3,2,4,3,9,2,2,5,2};
        int a=9,b=2;
        int count=0;
        for(int i=0;i<input.length;i++){
            for(int j=i;j<input.length;j++){
                    if(input[i]==a && input[j]==b) {
                         count++;
                  }
          
                }
            }
            System.out.println("Total pairs are: "+count);
        }
        
    }

