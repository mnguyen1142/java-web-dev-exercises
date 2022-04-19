package exercises.Class3Classes;

public class Student {

    private String name;
    private int id;
    private int credits;
    private double gpa;

    public Student(String pName, int pID, int pCredits, double pGPA) {
        name = pName;
        id = pID;
        credits = pCredits;
        gpa = pGPA;
    }

    public Student(String pName, int pID) {
        name = pName;
        id = pID;
        credits = 0;
        gpa = 0.0;
    }



    public String getName() { return name; }
    public int getID() { return id; }
    public int getCredits() { return credits; }
    public double getGPA() { return gpa; }



    public void setName(String pName) { name = pName; }
    public void setID(int pID) { id = pID; }
    public void setCredits(int pCredits) { credits = pCredits; }
    public void setGPA(double pGPA) { gpa = pGPA; }

}