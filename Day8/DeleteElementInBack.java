package Day8;

public class DeleteElementInBack {
    public static void main(String[] args) {
        int[] givenArr={3,4,6,8,9};
       
        int[] newArr=new int[givenArr.length-1];
        for(int i=0;i<givenArr.length-1;i++){
            newArr[i]=givenArr[i];
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        
    }
}
