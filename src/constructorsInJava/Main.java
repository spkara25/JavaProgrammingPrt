package constructorsInJava;

public class Main {
    public static void main(String[] args){
        String n = "Tom";
        int age = 25;
        int weight = 39;
        Human human = new Human(n, age, weight);

        System.out.println(human.age);
        human.eat();


    }
}
