package Day23.DailyPractice;
import java.util.HashMap;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int target=sca.nextInt();
        sca.close();
        int[] nums={2,7,28,15};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                System.out.println("twosum is: ("+map.get(complement)+","+i+")");
            }
            map.put(nums[i], i);
        }
    }
}
