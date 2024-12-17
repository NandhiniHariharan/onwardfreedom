package Day25.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; 
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
           return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums={2,7,10,22};
        int target=9;
        TwoSum sum=new TwoSum();
        int[] result=sum.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
