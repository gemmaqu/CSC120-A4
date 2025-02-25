public class Engine implements EngineRequirements {

    //attributes
    private FuelType f;
    private double  currentfuellevel;
    private double maxfuellevel;

    //constructor
    /**
     * 
     * @param f
     * @param currentfuellevel
     * @param maxfuellevel
     */
    public Engine(FuelType f, double currentfuellevel, double maxfuellevel){
        this.f = f;
        this.currentfuellevel = currentfuellevel;
        this.maxfuellevel = maxfuellevel;

    }

    public FuelType getfFuelType(){
        return this.f;
    }

    public double getCurrentFuel(){
        return this.currentfuellevel;

    }

    public double getMaxFuel(){
        return maxfuellevel;
    }

    public void refuel(){
       this.currentfuellevel = this.maxfuellevel;
      
    }

    public Boolean go(){
        return true;
    }

    public String toString(){
        return "Engine has fuel type: "+this.f+"current fuel level:"+this.currentfuellevel+ "max fuel level: "+this.maxfuellevel;
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC,100,200);
        System.out.println(myEngine);
    }

}
