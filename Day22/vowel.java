package Day22;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class vowel {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String input=scanner.nextLine().toLowerCase();
        scanner.close();
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);
        for(int i=0;i<input.length();i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i), map.get(input.charAt(i))+1);
            }
        }
        int totalCount=0;
        Iterator<Character> list=map.keySet().iterator();
        while(list.hasNext()){
            Character data=list.next();
            System.out.println("Count of "+ data +": " + map.get(data));
            int count=map.get(data);
            totalCount=totalCount+count;
        }
         System.out.println("Total count of vowels: "+totalCount);
    }
   
}

