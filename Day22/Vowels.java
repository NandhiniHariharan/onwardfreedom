package Day22;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Vowels {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String input=scanner.nextLine().toLowerCase();
        scanner.close();
        HashMap<String,Integer> map=new HashMap<>();
        map.put("a",0);
        map.put("e",0);
        map.put("i",0);
        map.put("o",0);
        map.put("u",0);
        for(int i=0;i<input.length();i++){
            String currentWord=""+input.charAt(i);
            if(map.containsKey(currentWord)){
                map.put(currentWord, map.get(currentWord)+1);
            }
        }
        int totalCount=0;
        Iterator<String> list=map.keySet().iterator();
        while(list.hasNext()){
            String data=list.next();
            int count=map.get(data);
            System.out.println("Count of "+ data +": " + map.get(data));
            totalCount=totalCount+count;
        }
        System.out.println("Total count of vowels: "+totalCount);
    }
   
}
