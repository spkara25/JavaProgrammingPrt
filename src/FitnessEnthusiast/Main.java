package FitnessEnthusiast;

public class Main {
    public static void main(String[] args)
    {
        String name = "Dinesh";
        int duration = 30;
        double burn = 9.7;
        fitnessEnthusiast fE = new fitnessEnthusiast(name ,duration, burn);

        System.out.println("the calories burned are: " + fE.calculateCalories());
    }
}
