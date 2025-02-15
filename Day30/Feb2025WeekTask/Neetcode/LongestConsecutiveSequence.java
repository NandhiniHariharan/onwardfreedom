package Feb2025WeekTask.Neetcode;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longseq(int[] nums){
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentnum=num;
                int currentseq=1;
                while(set.contains(currentnum+1)){
                    currentnum++;
                    currentseq++;
                }
                longest=Math.max(longest,currentseq);
            }
           
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 20, 4, 10, 3, 4, 5};
        int[] nums2 = {0, 3, 2, 5, 4, 6, 1, 1};
        
        System.out.println(longseq(nums1)); 
        System.out.println(longseq(nums2)); 
    }
}