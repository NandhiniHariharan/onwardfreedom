package School;

public class Class {
    public static void main(String args[]){
    Student student1=new Student();
    Teacher teacher1=new Teacher();
    student1.name="Kumaran";
    student1.studentId=2345;
    teacher1.name="Mythili";
    teacher1.subject="Business Management";
    System.out.println("The student name is: "+student1.getName());
    System.out.println("Student Id: "+student1.getStudentId());
    System.out.println("Teacher Name is: "+teacher1.getName());
    System.out.println("Taken subject is: "+teacher1.getSubject());
    }
}
