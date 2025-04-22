

public class Passenger implements PassengerRequirements{
    
    //attribute
    private String name;

    //constructor
    /**
     * costructor for Passenger class
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * 
     * @return name of the passenger
     * get the name the passenger
     */
    public String getname(){
        return this.name;
    }

    /**
     * Attempts to board a car as a passenger.
     * Prints a message indicating success or failure.
     *
     * @param c the Car that this passenger is attempting to board
     */
    public void boardCar(Car c){
        if (c.addPassenger(this)) {
            System.out.println("I am on the car");
        }
    else {
        System.out.println("I don't want to get on the car");
    }
    }


    /**
     * Attempts to disembark from a car.
     * Prints a message indicating success or failure.
     *
     * @param c the Car that this passenger is attempting to exit
     */
    public void getOffCar(Car c){
        if( c.removePassenger(this)){
            System.out.println("I want to get off the car");
        }
        else{
            System.out.println("I am not on the car");
        }
    
    }


    public static void main(String[] args) {
        Passenger onePassenger = new Passenger("Anna");
        Car busCar = new Car(100);
        onePassenger.boardCar(busCar);
        onePassenger.getOffCar(busCar);
        onePassenger.getOffCar(busCar);
    }
}