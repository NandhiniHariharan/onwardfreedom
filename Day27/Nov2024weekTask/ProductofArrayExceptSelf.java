package Day27.Nov2024weekTask;

public class ProductofArrayExceptSelf {
    public int[] prductofarray(int[] nums){
        int[] ans=new int[nums.length];
        int prefix=1;
        int suffix=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=prefix;
            prefix=prefix*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i]=ans[i]*suffix;
            suffix=suffix*nums[i];
        }
        System.out.print("[");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.print("]");
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        ProductofArrayExceptSelf product=new ProductofArrayExceptSelf();
        product.prductofarray(nums);
    }
}
