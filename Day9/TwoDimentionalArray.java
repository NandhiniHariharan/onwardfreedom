package Day9;
import java.util.Scanner;
public class TwoDimentionalArray {
    public static void main(String[] args) {
        
        int[][] Query={
            {2, 4},
            {5, 3},
            {4, 6}
        };
        
        for(int i=0;i<Query.length;i++){
            int[] childBag=Query[i];
            
    System.out.print(childBag[0]+" ");
       System.out.print(childBag[1]+" ");
        }
        
    }
}
