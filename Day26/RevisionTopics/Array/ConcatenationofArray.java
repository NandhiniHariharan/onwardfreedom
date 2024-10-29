package Day26.RevisionTopics.Array;
public class ConcatenationofArray{
    public int[] concatenation(int[] nums){
        int[] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,1};
        ConcatenationofArray concat=new ConcatenationofArray();
        int[] result=concat.concatenation(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
        
    }
}