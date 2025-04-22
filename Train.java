import java.util.ArrayList;

public class Train implements TrainRequirements{


    //Attributes
    private ArrayList<Car> cars;
    private int nCars;
    private Engine engine;


    //constructor
    /**
     * constructor for Train class
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){//make sure the order of parameters match README file.
        this.engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++){
            this.cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * @return the Engine instance associated with this object
     */
    public Engine getEngine() {
        return this.engine;
    }

    /**
     * Retrieves a Car object from the collection at the specified index.
     *
     * @param i the index of the Car to retrieve
     * @return the Car at the specified index, or null if the index is out of bounds
     */
    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        }else{
            return null;
        }
    }

    /**
     * @return the max capacity of trains by adding the max capacity of each car as an integer
     */
    public int getMaxCapacity() {
        int totalCapacity = 0;
        for (Car car : cars) {
            totalCapacity += car.getCapacity();
        }
        return totalCapacity;
    }

    /**
     * @return the remaining seats on train by gettng the remaining seats in each car
     */
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : cars) {
            remainingSeats += car.seatsRemaining();
        }
        return remainingSeats;
    }
    
    /**
     * Print the manifest of the train by printing the manifest of each car
     * print Car x is EMPTY if the car is empty
     * print the passenger name if there's passengers on the car
     */
    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + i + " Manifest:");
            cars.get(i).printManifest();
        }
    }

    public static void main(String[] args) {
        
        Passenger onePassenger = new Passenger("Anna");
        Passenger bob = new Passenger("bob");
        
        // anothercar.addPassenger(onePassenger);
        // anothercar.addPassenger(bob);
        Train mytrain = new Train(FuelType.ELECTRIC, 100, 10, 50);
        mytrain.getEngine();
        mytrain.cars.get(2).addPassenger(bob);
        mytrain.cars.get(2).addPassenger(onePassenger);
        mytrain.printManifest();

    }
    
}



