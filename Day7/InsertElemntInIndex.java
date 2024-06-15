import java.util.Scanner;

public class InsertElemntInIndex {
    public static void main(String[] args) {
        int[] givenArr={7,14,21,33,20,77};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the insert number: ");
             
        int insertNum=scanner.nextInt();
        System.out.print("Enter the position: "); 
        int position=scanner.nextInt();
        int[] newArr=new int[givenArr.length+1];
        for(int i=0;i<givenArr.length;i++){
            newArr[i]=givenArr[i];
            }
            newArr[position]=insertNum;
            for(int i=position;i<givenArr.length;i++){
                newArr[i+1]=givenArr[i];
            }
            for(int i=0;i<newArr.length;i++){
                System.out.print(newArr[i]+" ");
            }
       }
}
