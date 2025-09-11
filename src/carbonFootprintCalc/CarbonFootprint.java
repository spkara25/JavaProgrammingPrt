package carbonFootprintCalc;

public final class CarbonFootprint extends EnvironmentalMetrics{
    private final double  electricityEmissionFactor = 0.4;
    private final double transportationEmissionFactor = 2.5;

    CarbonFootprint(double elecUsage, double transports){
        this.electricityUsage = elecUsage;
        this.transportationEmissions = transports;
    }

    void carbonEmissions(){
        System.out.println("Transport: "+ transportationEmissions);
        double electricityCarbon = electricityUsage * electricityEmissionFactor;
        System.out.println("the carbon footprint estimate: "+electricityCarbon);
        double totalCarbonFootprint = electricityCarbon + transportationEmissions;
        System.out.println("the total carbon footprint: " + totalCarbonFootprint);

    }

}
