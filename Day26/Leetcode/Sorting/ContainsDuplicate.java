package Day26.Leetcode.Sorting;
import java.util.HashSet;
public class ContainsDuplicate {
    public static boolean duplicateFinding(int[] nums){
        HashSet<Integer> seen=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,3};
        System.out.println(duplicateFinding(nums));
    }
}
