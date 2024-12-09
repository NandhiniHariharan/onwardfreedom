package Day28.Dec2024WeakTask;
import java.util.HashSet;

public class NRepeatedElementinSize2NArray {
    public int repeatedElement(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={2,1,2,5,3,2};
        NRepeatedElementinSize2NArray repe=new NRepeatedElementinSize2NArray();
        System.out.println(repe.repeatedElement(nums));
    }
}
