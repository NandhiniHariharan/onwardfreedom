package Day18.revision;

public class Duck extends Animal implements Swimmer,Flyer{

    public void fly() {
        System.out.println("i am flying");
    }

    public void swim() {
        System.out.println("i am swimming");
    }
    public void shout(){
        System.out.println("quak quak");
    }
    
}
