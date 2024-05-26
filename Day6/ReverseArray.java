package Day6;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,11,13,15};
        int[] reverseArr=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int newArrIndex=(arr.length-1)-i;
            reverseArr[newArrIndex]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(reverseArr[i]+" ");
        }
    }
    
}
