package Feb2025WeekTask.Neetcode;
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
    public int[] sum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums={3,4,5,6};
        int target=7;
        TwoSum summ=new TwoSum();
        int[] result=summ.sum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
