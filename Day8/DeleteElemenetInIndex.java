package Day8;

public class DeleteElemenetInIndex {
    public static void main(String[] args) {
        int[] givenArr={7,14,21,33,20,77};
        int deleteNum=14;
        int[] newArr=new int[givenArr.length-1];
        int k=0;
        for(int i=0;i<givenArr.length;i++){
            if(givenArr[i] != deleteNum){
                 newArr[k]=givenArr[i];
                 k++;
            }
            }for(int i=0;i<newArr.length;i++){
                 System.out.print(newArr[i]+" ");
            }
       }
}
