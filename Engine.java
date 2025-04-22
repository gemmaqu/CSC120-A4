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

    /**
     * @return the fuel type of the engine
     */
    public FuelType getFuelType(){
        return this.f;
    }


    /**
     * @return get the max level of fuel of the engine
     */
    public double getMaxFuel(){
        return this.maxfuellevel;
    }

   /**
    * @return get the current level of fuel of the engine
    */
    public double getCurrentFuel(){
        return this.currentfuellevel;

    }

    /**
     * Refills the fuel tank to maximum capacity.
     * Sets the current fuel level equal to the maximum fuel level.
     */
    public void refuel(){
       this.currentfuellevel = this.maxfuellevel;
      
    }

    // above 0 return true, otherwise false, decreasing
    /**
     * Attempts to move the vehicle, consuming fuel in the process.
     * 
     * @return true if the vehicle successfully moves (fuel was available),
     *          false if the vehicle cannot move (no fuel available)
     */
    public Boolean go(){
        if (this.currentfuellevel > 0 ){
            this.currentfuellevel -= 2;
            return true;
        }
        else{
            return false;
        }
    }


    /**
     * Returns a string representation of this engine.
     * @return a string containing the fuel type, current fuel level, 
     *         and maximum fuel level of this engine
     */
    public String toString(){
        return "Engine has fuel type: "+this.f+", current fuel level:"+this.currentfuellevel+ ", max fuel level: "+this.maxfuellevel;
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 10.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
        System.out.println(myEngine);
    }
}
