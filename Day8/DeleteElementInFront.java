package Day8;

public class DeleteElementInFront {
    public static void main(String[] args) {
        int[] givenArr={3,4,6,8,9};
       
        int[] newArr=new int[givenArr.length-1];
        for(int i=1;i<givenArr.length;i++){
            newArr[i-1]=givenArr[i];
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        
    }
}

