package inheritance.usageOfInterfacing;

public class Fish implements Prey , Predator{

    @Override
    public void hunt()
    {
        System.out.println("this fish is hunting other smol fishes");
    }
    public void flee()
    {
        System.out.println("This fish is fleeing from other fishes");
    }

}
