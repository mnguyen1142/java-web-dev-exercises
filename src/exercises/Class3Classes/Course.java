package exercises.Class3Classes;
import java.util.ArrayList;

public class Course {

    private String name;
    private Teacher teacher;
    private ArrayList<Student> roster;

    public Course(String name, Teacher teacher, ArrayList<Student> roster) {
        this.name = name;
        this.teacher = teacher;
        this.roster = roster;
    }

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        roster = new ArrayList<>();
    }


    /* getters */
    public String getName() { return name; }
    public Teacher getTeacher() { return teacher; }
    public ArrayList<Student> getRoster() { return roster; }


    /* setters */
    public void setName(String name) { this.name = name; }
    public void setTeacher(Teacher teacher) { this.teacher = teacher; }
    public void addRoster(Student student) { roster.add(student); }

}
