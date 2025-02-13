package Feb2025WeekTask.Neetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class GroupAnagram {
public List<List<String>> grouping(String[] strs){
    HashMap<String,List<String>> res=new HashMap<>();
    for(String s:strs){
        int[] count=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        String key=Arrays.toString(count);
        res.putIfAbsent(key,new ArrayList<>());
        res.get(key).add(s);
    }
    return new ArrayList<>(res.values());
}
public static void main(String[] args) {
    String[] strs1={"act","pots","tops","cat","stop","hat"};
    String[] strs2={"x"};
    String[] strs3={""};
    GroupAnagram gro=new GroupAnagram();
    System.out.println(gro.grouping(strs1));
    System.out.println(gro.grouping(strs2));
    System.out.println(gro.grouping(strs3));
}
}