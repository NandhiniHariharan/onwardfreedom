package Feb2025WeekTask;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }  
        HashMap<Character,Integer> map=new HashMap<>();  
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            map.put(sc,map.getOrDefault(sc, 0)+1);
            map.put(tc, map.getOrDefault(tc, 0)-1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="racecar",t1="carrace";
        String s2="jar",t2="jam";
        ValidAnagram anagram=new ValidAnagram();
        System.out.println(anagram.isAnagram(s1, t1));
        System.out.println(anagram.isAnagram(s2, t2));
    }
}