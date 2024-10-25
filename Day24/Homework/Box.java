package Day24.Homework;

public class Box<T> {
    T item;
    public T getItem(){
        return item;
    }
    public void setItem(T input){
        this.item=input;
    }
    public static void main(String[] args) {
        Box<Integer> box=new Box<Integer>();
        Box<String> box2=new Box<String>();
        box.setItem(10);
        box2.setItem("pencil");
        System.out.println(box.getItem());
        System.out.println(box2.getItem());
    }
}
