package Day21.SimpleProgram;
public class TwoSum{
    public static void main(String args[]){
       int[] input={2, 7, 11, 15};
       int total=9;
       for(int i=0;i<input.length;i++){
        for(int j=i+1;j<input.length;j++){
            if(input[i]+input[j]==total){
                System.out.println("Pair found: Index " + i + " (" + input[i] + ") and Index " + j + " (" + input[j] + ")");
              break;
            }
        }
       }
    }
}