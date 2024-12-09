package Day28.Dec2024WeakTask;

public class CheckBalancedString {
    public boolean checkingBalance(String num){
        int odd=0,even=0;
        for(int i=0;i<num.length();i++){
            int digit=Character.getNumericValue(num.charAt(i));
            if(i%2==0){
                even+=digit;
            }
            else{
                odd+=digit;
            }
        }
        if(odd==even){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String num= "24123";
        CheckBalancedString che=new CheckBalancedString();
        System.out.println(che.checkingBalance(num));
    }
}
