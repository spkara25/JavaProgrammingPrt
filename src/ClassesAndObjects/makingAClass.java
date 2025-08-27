package ClassesAndObjects;

public class makingAClass {
    String breed = "Labrador", color=" white";
    int age = 4 ;
    void barking()
    {
        System.out.println("Dog is barking");
    }
    void hungry()
    {
        System.out.println("Dog is hungry");
    }
    void sleeping()
    {
        System.out.println("Dog is sleeping");
    }


    public static void main(String[] args)
    {
        makingAClass obj1 = new makingAClass();
        System.out.println(obj1.breed);
        System.out.println(obj1.color);

        makingAClass obj2 = new makingAClass();
        System.out.println(obj2.age);

    }

}
