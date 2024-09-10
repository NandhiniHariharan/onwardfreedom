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
   public String getName(){
      return this.name;

   } public Person(Person A){
     this.name=A.name;
     this.gender=A.gender;
     this.age=A.age;
   }

  
   public void setName(String name){
      this.name=name;
   }
}