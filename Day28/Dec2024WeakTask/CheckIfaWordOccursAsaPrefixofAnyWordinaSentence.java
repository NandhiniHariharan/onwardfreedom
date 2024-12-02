package Day28.Dec2024WeakTask;

public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {
    public int searchingWord(String sen, String searchWord){
        String[] str=sen.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String sen="this problem is an easy problem";
        String searchWord="eas";
        CheckIfaWordOccursAsaPrefixofAnyWordinaSentence check=new CheckIfaWordOccursAsaPrefixofAnyWordinaSentence();
        System.out.println(check.searchingWord(sen, searchWord));
    }
}
