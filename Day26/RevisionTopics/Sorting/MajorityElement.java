package Day26.RevisionTopics.Sorting;
public class MajorityElement{
    public int majorityElement(int[] nums){
        int canditate=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                canditate=num;
                count=1;
            }
            else if(canditate==num){
                count++;
            }else{
                count--;
            }
        }
        return canditate;
    }
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        MajorityElement element=new MajorityElement();
        System.out.println(element.majorityElement(nums));
    }
}