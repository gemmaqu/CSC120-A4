import java.util.ArrayList;

public class Train implements TrainRequirements{


    //Attributes
    private ArrayList<Car> cars;
    private int nCars;
    private Engine engine;


    //constructor
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity,double currentfuellevel){
        this.engine = new Engine(fuelType, currentfuellevel, fuelCapacity);
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++){
            this.cars.add(new Car(passengerCapacity));
        }

    @Override
    public Engine getEngine() {
        return this.engine;
    }

    @Override
    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        }
        throw new IndexOutOfBoundsException("Invalid car index");
    }

    @Override
    public int getMaxCapacity() {
        int totalCapacity = 0;
        for (Car car : cars) {
            totalCapacity += car.getCapacity();
        }
        return totalCapacity;
    }

    @Override
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : cars) {
            remainingSeats += car.seatsAvailable();
        }
        return remainingSeats;
    }
    
    @Override
    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + i + " Manifest:");
            cars.get(i).printPassengerList();
        }
    }
    
}



