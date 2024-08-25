package Day13;

public class Store {
    void getsoap(int money){
        System.out.println(money);
        System.out.println("Soap Purchased");
    }
    void getsamphoo(int money){
        System.out.println(money);
        System.out.println("Samphoo Purchased");
    }
    void getmasala(int money){
        System.out.println(money);
        System.out.println("Masala Purchased");
    }
    public static void main(String args[]){
        Store obj=new Store();
        obj.getsoap(20);
        obj.getsamphoo(5);
        obj.getmasala(25);
    }
}
