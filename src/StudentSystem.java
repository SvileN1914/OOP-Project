import java.util.ArrayList;

public class StudentSystem {

    private ArrayList<Student> students = new ArrayList<>();

    public void enroll(String name, String fn, String program, int year, int group) {

        Student student = new Student(name, fn, program, year, group);
        students.add(student);

        System.out.println("Student added.");
    }

    public void print(String fn) {

        for(Student s : students){

            if(s.getFacultyNumber().equals(fn)){
                s.printStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }
}