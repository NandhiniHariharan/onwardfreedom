package Day9;

public class SearchElement {
    public static void main(String[] args) {
        int[] givenArr={7,14,21,33,20,77};
        int searchNum=20;
            
        for(int i=0;i<givenArr.length;i++){
            if(givenArr[i] == searchNum){
                 System.out.print(givenArr[i]+" Element found in the Array ");
                 break;
            }
            }
       }
}
