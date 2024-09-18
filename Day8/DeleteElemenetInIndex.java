package Day8;

public class DeleteElemenetInIndex {
    public static void main(String[] args) {
        int[] givenArr={7,14,21,33,20,77};
        int deleteIndex=2;
        int[] newArr=new int[givenArr.length-1];
     for (int i = 0; i < deleteIndex; i++) {
          newArr[i] = givenArr[i]; // Copy elements before the delete position
      }
      
     for (int i = deleteIndex; i < newArr.length; i++) {
          newArr[i] = givenArr[i + 1]; // Copy elements after the delete position
      }
     System.out.println("Array after deletion:");
     for (int i = 0; i < newArr.length; i++) {
          System.out.print(newArr[i] + " ");
      }   
       }
}
