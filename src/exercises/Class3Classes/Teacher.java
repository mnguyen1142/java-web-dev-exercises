package exercises.Class3Classes;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String first, String last, String subject, int years) {
        firstName = first;
        lastName = last;
        this.subject = subject;
        yearsTeaching = years;
    }

    public Teacher(String first, String last, String subject) {
        firstName = first;
        lastName = last;
        this.subject = subject;
        yearsTeaching = 0;
    }


    /* getters */
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSubject() { return subject; }
    public int getYearsTeaching() { return yearsTeaching; }


    /* setters */
    public void setFirstName(String first) { firstName = first; }
    public void setLastName(String last) { lastName = last; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setYearsTeaching(int years) { yearsTeaching = years; }

}
