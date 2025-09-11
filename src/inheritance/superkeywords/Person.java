package inheritance.superkeywords;

public class Person {
    String first;
    String last;

    Person(String firstName, String lastName)
    {
        this.first = firstName;
        this.last = lastName;
    }

    void showName()
    {
        System.out.println(this.first + " " + this.last);
    }
}
