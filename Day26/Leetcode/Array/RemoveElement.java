package Day26.Leetcode.Array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int k=0;
        int val=3;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println("K= "+k);
         System.out.print("Modified array: [");
         for (int i = 0; i < k; i++) {
             System.out.print(nums[i] + ",");
         }
         System.out.println("]");
    }
}
