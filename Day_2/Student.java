public class Student {
    int studentId;
    String studentName;
    char studentGrade;

    public Student() {
        this(0 , "unknown" , 'U');        
    }

    public Student(int studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGrade = grade;
    }


    public void display() {
        System.out.println("Student Id : " + studentId );
        System.out.println("Student Name : " + studentName );
        System.out.println("Student Grade : " + studentGrade );

    }

    public static void main(String[] args){
        Student myStudent = new Student();
        myStudent.display();

        System.out.println();
        
        Student student2 = new Student(1, "Avani", 'A');
        student2.display();
    }
}
