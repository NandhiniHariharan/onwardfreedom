package Day27.Nov2024weekTask;

public class ReverseString {
    public void reversingString(char[] s){
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        System.out.print("[");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+",");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        ReverseString rev=new ReverseString();
        rev.reversingString(s);
    }
}
