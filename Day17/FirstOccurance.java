package Day17;
public class FirstOccurance {
public static void main(String args[]){
    int[] A={10,5,3,4,3,5,6};
    for(int i=0;i<A.length;i++){
        int count=0;
        int first=0;
        for(int j=i;j<A.length;j++){
            if(A[i]==A[j]){
                first=A[i];
                count++;
            }
        }
        System.out.println("The first occurance is: "+first);
    }
}
}
