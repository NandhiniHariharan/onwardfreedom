import java.util.Scanner;
public class InsertElementInFront {
    public static void main(String[] args) {
        int[] givenArr={3,4,6,8,9};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the insert number: ");
        int frontAdded=scanner.nextInt();
        
        int[] newArr=new int[givenArr.length+1];
        for(int i=0;i<givenArr.length;i++){
            newArr[i]=givenArr[i];
        }
        
        newArr[0]=frontAdded;
        for(int i=0;i<givenArr.length;i++){
            newArr[i+1]=givenArr[i];
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        
    }
}

