package Feb2025WeekTask;

public class StoneRemovalGame {
    public boolean removal(int n){
        int[] stones={19,15,11,7,3};
        for(int stone:stones){
            if(n>=stone){
                n-=stone;
            }
            else{
                return n >= (stone / 2) + 1;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        StoneRemovalGame game=new StoneRemovalGame();
        System.out.println(game.removal(12));
        System.out.println(game.removal(1));
        System.out.println(game.removal(11));
    }
}
