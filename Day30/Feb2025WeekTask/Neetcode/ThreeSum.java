package Feb2025WeekTask.Neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> sum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1,r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum>0){
                    l++;
                }else if(sum<0){
                    r--;
                }else{
                    list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        ThreeSum sum=new ThreeSum();
        System.out.println(sum.sum(nums));
    }
}
