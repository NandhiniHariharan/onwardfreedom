package Feb2025WeekTask.Neetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class TopKFrequentElements {
    public int[] KFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int key:  map.keySet()){
            int freq=map.get(key);
            if(bucket[freq] == null){
                bucket[freq]=new ArrayList();
            }
            bucket[freq].add(key);
        }
        int[] result=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0 && index<k;i--){
            if(bucket[i] != null){
                for(int num:bucket[i]){
                    if(index<k){
                        result[index++]=num;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TopKFrequentElements sol = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(sol.KFrequent(nums, k)));
    }
}