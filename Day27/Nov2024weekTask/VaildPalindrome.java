package Day27.Nov2024weekTask;
public class VaildPalindrome {
    public boolean palindorme(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        VaildPalindrome vaild=new VaildPalindrome();
        System.out.println(vaild.palindorme(s));
    }
}
