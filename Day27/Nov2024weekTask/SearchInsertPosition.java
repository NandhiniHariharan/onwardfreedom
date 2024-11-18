package Day27.Nov2024weekTask;

public class SearchInsertPosition {
    public void searching(int[] nums,int target){
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.println(i);
                break;
            }
            if(nums[i]>target){
                System.out.println(i);
                break;
            }
        }
        if (nums[nums.length - 1] < target) {
            System.out.println(nums.length);
        }
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
        SearchInsertPosition sear=new SearchInsertPosition();
        sear.searching(nums, target);
    }
}
