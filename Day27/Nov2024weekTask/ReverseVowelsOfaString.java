package Day27.Nov2024weekTask;
import java.util.HashSet;
import java.util.Scanner;
public class ReverseVowelsOfaString {
    public String reversingVowerls(String s){
        HashSet<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        char[] chars=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            while(left<right && !vowels.contains(chars[left])){
                left++;
            }
            while(left<right && !vowels.contains(chars[right])){
                right--;
            }

            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
          return new String(chars);
        }
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String s=sca.nextLine();
        ReverseVowelsOfaString rev=new ReverseVowelsOfaString();
        System.out.println(rev.reversingVowerls(s));
    }
}
