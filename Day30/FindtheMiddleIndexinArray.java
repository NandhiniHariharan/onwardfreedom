public class FindtheMiddleIndexinArray {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        FindtheMiddleIndexinArray solution = new FindtheMiddleIndexinArray();
        System.out.println(solution.findMiddleIndex(new int[]{2, 3, -1, 8, 4})); 
        System.out.println(solution.findMiddleIndex(new int[]{1, -1, 4}));
        System.out.println(solution.findMiddleIndex(new int[]{2, 5})); 
    }
}

