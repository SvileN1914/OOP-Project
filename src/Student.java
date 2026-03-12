public class Student {

    private String name;
    private String facultyNumber;
    private String program;
    private int year;
    private int group;

    public Student(String name, String facultyNumber, String program, int year, int group) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.program = program;
        this.year = year;
        this.group = group;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("FN: " + facultyNumber);
        System.out.println("Program: " + program);
        System.out.println("Year: " + year);
        System.out.println("Group: " + group);
    }
}