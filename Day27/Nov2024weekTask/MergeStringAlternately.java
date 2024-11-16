package Day27.Nov2024weekTask;

public class MergeStringAlternately {
    public static void main(String[] args) {
        String word1="abc";
        String word2="pqr";
        String result=" ";
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            result+=word1.charAt(i);
            result+=word2.charAt(j);
            i++;
            j++;
        }
        System.out.println(result);
    }
}
