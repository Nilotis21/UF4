package cat.mvm;

public class Student extends Person {
    private String course;

    public Student(String name, String surname, String dni, int age, float height, String course){
        super(name, surname, dni, age, height);
        this.setCourse(course);
    }

    public String getCourse() {return this.course;}
    public void setCourse(String course) { this.course = course; }
}
