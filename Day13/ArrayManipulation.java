package Day13;

public class ArrayManipulation {
    public static int[] reverse(int[] array){
        int[] reverseArr=new int[array.length];
        for(int i=array.length-1;i>=0;i--){
            int newarray=(array.length-1)-i;
            reverseArr[newarray]=array[i];
        }
        return reverseArr;
    }
    public static int findMax(int[] array){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    public static int findMin(int[] array){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[]args){
        int[] array={2,3,4,5,7};
        int[] reverseArray=reverse(array);
        for(int i=0;i<array.length;i++){
            System.out.print(reverseArray[i]+" ");
        }
        System.out.println();
        int FindMax=findMax(array);
        System.out.println("The finding maxium is: "+FindMax);
        System.out.println();
        int FindMin=findMin(array);
        System.out.println("The findinf minium is: "+FindMin);
    }
        
}
