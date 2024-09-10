package Day18.revision;

public class World {
    public static void main(String[] args) {
       Person person1=new Person("Yashika","Female", 22 );
       Person person2=new Person("Malathi","Female", 24 );
       Animal animal1=new Animal("Carnivores","Wild animal");
       Animal animal2=new Animal("Harbivores","Wild animal");
       System.out.println(person1.getName());
       //*Person person3=new Person(person2);
       Person person3=person2;
       person3.setName("AARTHI");
       System.out.println(person3.getName());
       System.out.println(person2.getName());
    }
}
