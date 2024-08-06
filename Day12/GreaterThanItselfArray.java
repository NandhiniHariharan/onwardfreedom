package Day12;

public class GreaterThanItselfArray {
    public static void main(String[] args) {
        int[] input={3,1,2};
        int[] input1={5,5,3};
        int max=input[input.length-1];
        int count=0;
        for(int i=input.length-2;i>=0;i--){
            if(input[i]>max){
                max=input[i];
                count++;
            }
            
        }
        
        System.out.println(count);
        count=0;
        max=input1[input1.length-1];
        for(int i=input1.length-2;i>=0;i--){
            if(input1[i]>max){
                max=input1[i];
                count++;
            }
            
        }
        System.out.println(count);
    }
}
