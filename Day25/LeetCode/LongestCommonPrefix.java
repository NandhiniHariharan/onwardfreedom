package Day25.LeetCode;

public class LongestCommonPrefix {
    public String commonprefix(String[] str){
        String prefix= str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        LongestCommonPrefix com=new LongestCommonPrefix();
        System.out.println("'"+com.commonprefix(str)+"'");
    }
}
