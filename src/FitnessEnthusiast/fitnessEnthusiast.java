package FitnessEnthusiast;

public class fitnessEnthusiast extends Person{

    int duration;
    double calorieBurnRate;
    fitnessEnthusiast(String name, int duration, double burnRate){
        super(name);
        this.duration = duration;
        this.calorieBurnRate = burnRate;
    }

    double calculateCalories(){
        return duration * calorieBurnRate;
    }
}
