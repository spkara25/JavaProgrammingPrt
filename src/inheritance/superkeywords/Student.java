package inheritance.superkeywords;

public class Student extends Person{
    double GPA;

    Student(String first, String last, double gpa)
    {
        super(first, last);
        this.GPA = gpa;
    }

    void showGPA()
    {
        System.out.println("The GPA of the student is: "+this.GPA);
    }

}
