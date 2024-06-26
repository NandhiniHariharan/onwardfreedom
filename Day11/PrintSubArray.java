package Day11;

public class PrintSubArray {
    public static void main(String[] args) {
        int[] input={9,2,3,5,7,9,8,1};
        int sum=0;
        for(int i=0;i<input.length;i++){
            for(int j=i;j<input.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(input[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
