package carbonFootprintCalc;

public class Main {
    public static void main(String[] args)
    {
        double electricityUsage = 6.2;
        double transportationEmissions = 3.4;
        CarbonFootprint cF = new CarbonFootprint(electricityUsage, transportationEmissions);
        cF.carbonEmissions();


    }
}
