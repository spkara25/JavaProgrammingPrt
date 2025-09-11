package printLengthofstring;

public class Student extends Person{

    Student(String name)
    {
        super(name);
    }

    void getLength()
    {
        String studentName = super.getName();
        System.out.println("length of the name: "+studentName.length());
    }
}
