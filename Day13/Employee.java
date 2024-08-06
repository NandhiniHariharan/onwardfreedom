package Day13;

public class Employee {
    String name;
    int age;
    double salary;
    public void setDetails(String name,int age,double salary){
      this.name=name;
      this.age=age;
      this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee age: "+age);
        System.out.println("Employee salary: "+salary);
    }
    public static void main(String[]args){
      Employee emp=new Employee();
      emp.name ="John";
      emp.age=21;
      emp.salary=400000;
      emp.displayDetails();
    }

}
