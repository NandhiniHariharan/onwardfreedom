package Day17;
import java.util.HashMap;
import java.util.Iterator;

public class FindOccurrence {

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 5, 2, 6, 8, 2, 1, 4, 8};
        HashMap<String, Integer> map = new HashMap<>();

        
        for (int i = 0; i < input.length; i++) {
            String key = "" + input[i];
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                Integer count = map.get(key);
                map.put(key, count + 1); 
            }
        }

        
        Iterator<String> myList = map.keySet().iterator();
        while (myList.hasNext()) {
            String data = myList.next();
            System.out.println(data + "  " + map.get(data));
        }
    }
}
