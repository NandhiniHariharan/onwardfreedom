package Day25.LeetCode;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,5,5,6,6,7,8};
        int i=0;
            for(int j=1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    i++;
                    arr[i]=arr[j];
                }
            }
             int sum= i+1;
             System.out.println("Number of Unique elements: "+sum);
        
        for(int k=0;k<sum;k++){
            System.out.print(arr[k]+" ");
        }
       
    }
}
