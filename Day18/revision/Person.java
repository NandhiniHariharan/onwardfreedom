package Day18.revision;

public class Person {
   private String name;
   private String gender;
   private int age;
   public Person(String name, String gender, int age){
    this.name=name;
    this.gender=gender;
    this.age=age;
   }
   public static void main(String args[]){
    Person person1=new Person("nandhini","female",21);
    System.out.println(""+person1.name);
   }
}
