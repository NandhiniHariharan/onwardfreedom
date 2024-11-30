package Day28.Dec2024WeakTask;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray{
    public List<String> StringMatcing(String[] words){
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[j].contains(words[i])){
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] words={"mass","as","hero","superhero"};
        StringMatchingInAnArray str=new StringMatchingInAnArray();
        System.out.println(str.StringMatcing(words));
    }
}