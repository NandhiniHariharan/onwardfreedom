package Day25.LeetCode;

public class JewelsandStones {
    public static void main(String[] args) {
        String jewels="aA";
        String stones="aaAABBB";
        int sum=0;
        for(int i=0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i))!= -1){
                sum++;
            }
        }
            System.out.println(sum);
    }
}
