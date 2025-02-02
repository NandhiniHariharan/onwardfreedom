public class DefusetheBomb{
public int[] defuse(int[] code,int k){
    int n=code.length;
    int[] result=new int[n];
    if(k==0){
        return result;
    }
    for(int i=0;i<n;i++){
        int sum=0;
        if(k>0){
            for(int j=1;j<=k;j++){
                sum+=code[(i+j)%n];
            }
        }
        else{
            for(int j=1;j<=-k;j++){
                sum+=code[(i-j+n)%n];
            }
        }
        result[i]=sum;
    }
    return result;
}
public static void main(String[] args) {
    int[] code={5,7,1,4};
    int k=3;
    DefusetheBomb bomb=new DefusetheBomb();
    int[] decryptedCode = bomb.defuse(code, k);
      for (int i = 0; i < decryptedCode.length; i++) {
        System.out.print(decryptedCode[i]+",");
    }
}
}