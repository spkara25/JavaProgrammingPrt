package constructorsInJava;

public class Human {
    String n;
    int age;
    int weight;
    Human(String name, int age, int weight){
        System.out.println("This is a constructor called");
        this.n = name;
        this.age = age;
        this.weight = weight;
    }
    void eat()
    {
        System.out.println("this person is eating: "+this.n);
        System.out.println("this person has this much age: "+this.age);
    }
}
