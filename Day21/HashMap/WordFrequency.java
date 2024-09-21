package Day21.HashMap;

import java.util.HashMap;

public class WordFrequency {
    public static void main(String args[]){
        String sentence="apple banana apple orange banana apple";
        String[] words=sentence.split(" ");
        HashMap<String, Integer> wordCount=new HashMap<>();
        for(String word: words){
            if(wordCount.containsKey(word)){
               wordCount.put(word,wordCount.get(word)+1);
            }
            else{
                wordCount.put(word,1);
            }
        }
        for(String word:wordCount.keySet()){
            System.out.println(word+"-->"+wordCount.get(word));
        }
    }
}
