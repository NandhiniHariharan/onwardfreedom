package Day26.Leetcode.Encapsulation;

public class StudentDetails {
    private int StudentID;
    private String StudentName;
    private int[] Grades;
    public void setStudentID(int StudentID){
        this.StudentID=StudentID;
    }
    public int getStudentID(){
    return StudentID;
    }
    public void setStudentName(String StudentName){
        this.StudentName=StudentName;
    }
    public String getStudentName(){
        return StudentName;
    }
    public void setGrades(int[] Grades){
        this.Grades=Grades;
    }
    public int[] getGrades(){
        return Grades;
    }
    public double calculateAverge(){
        if(Grades == null || Grades.length ==0 ){
            return 0;
        }
        int sum=0;
        for(int grades:Grades){
            sum+=grades;
        }
        return (double) sum/Grades.length;
    }

    public static void main(String[] args) {
        int[] Grades={85, 90, 78, 92};
        StudentDetails student=new StudentDetails();
        student.setStudentID(12356);
        student.setStudentName("Soniya");
        student.setGrades(Grades);
        System.out.println(student.getStudentID());
        System.out.println(student.getStudentName());
        System.out.println(student.calculateAverge());
    }
}
