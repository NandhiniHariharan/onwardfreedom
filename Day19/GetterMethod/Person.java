package GetterMethod;

public class Person {
    private String name;
    private  String gender;
    private int age;
    public Person(String name, String gender, int age){
     this.name=name;
     this.gender=gender;
     this.age=age;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Person person1=new Person("Yashika","Female",21);
        System.out.println(person1.getName());
        System.out.println(person1.getGender());
        System.out.println(person1.getAge());
    }
}
