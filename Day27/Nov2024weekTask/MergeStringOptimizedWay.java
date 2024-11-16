package Day27.Nov2024weekTask;
import java.util.Scanner;
public class MergeStringOptimizedWay {
    public String merging(String word1, String word2){
        StringBuilder result=new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }
        if(i<word1.length()){
            result.append(word1.substring(i));
        }
        if(j<word2.length()){
            result.append(word2.substring(j));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter the word 1: ");
        String word1=sca.nextLine();
        System.out.print("Enter the word 2: ");
        String word2=sca.nextLine();
        MergeStringOptimizedWay str=new MergeStringOptimizedWay();
        System.out.println(str.merging(word1, word2));
    }
}
