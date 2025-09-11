package inheritance.superkeywords;

public class Main {

    public static void main(String[] args)
    {
        String f = "Tom";
        String l = "Riddle";
        double GPA = 9.2;
        int salary = 24909;

        Person p = new Person(f, l);
        p.showName();

        Student s = new Student(f, l, GPA);
        System.out.print("Name of the student: ");
        s.showName();
        s.showGPA();

        Employee e = new Employee(f, l, salary);
        e.showName();
        e.showSalary();

    }

}
