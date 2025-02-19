package Feb2025WeekTask.Neetcode;
public class ValidPalindrome {
    public boolean palindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="Was it a car or a cat I saw?";
        String s2="tab a cat";
        ValidPalindrome vaild=new ValidPalindrome();
        System.out.println(vaild.palindrome(s1));
        System.out.println(vaild.palindrome(s2));
    }
}