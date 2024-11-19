package Day27.Nov2024weekTask;

import java.util.Arrays;

public class PlusOne{
    public static int[] addingOne(int[] add){
        for(int i=add.length-1;i>=0;i--){
            if(add[i]<9){
                add[i]++;
                return add;
            }
            else{
                add[i]=0;
            }
        }
        add=new int[add.length+1];
        add[0]=1;
        return add;
    }
    public static void main(String[] args) {
        int[] add={9,9,1};
        int [] result=addingOne(add);
        System.out.println(Arrays.toString(result));
    }
}
