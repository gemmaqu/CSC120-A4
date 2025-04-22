import java.security.AlgorithmParametersSpi;
import java.util.ArrayList;
// import Passenger;


//Please look at my reflection. Thank you!
public class Car implements CarRequirements{

    

    //Attributes
    private int capacity;//lowercase all the variables
    private ArrayList<Passenger> passengeronboard;//lowercase
    private int currentpassengers;//lowercase

    //constructor
    /**
     * constructor for Car class
     * @param Capacity
     */
    public Car(int Capacity){
        this.capacity = Capacity;
        this.passengeronboard = new ArrayList<Passenger>(Capacity);
        this.currentpassengers = 0;
    }
        
    /**
     * @return capacity of car as an integer
     * get the capacity of the car
     */
    public int getCapacity(){
        return this.capacity;
    }

    /**
     * @return remaining seats in the car as an integer
     * get the number of reamaning seats in the cas
     */
    public int seatsRemaining(){
        return this.capacity - this.currentpassengers;
    }


    /**
     * @param p the passenger you want to add to the car
     * @return Boolean True if the passenger is added on the car , Boolean False if no seats remaning.
     */
    public Boolean addPassenger(Passenger p){
        if (seatsRemaining() > 0){
            this.currentpassengers += 1;
            this.passengeronboard.add(p);
            return Boolean.TRUE;    
        }
        else{
            return Boolean.FALSE;
        }
    }

    /**
     * @param p the passenger you want to remove from the car
     * @return Boolean True if the passenger is removed from the car , Boolean False if no seats remaning.
     */
    public Boolean removePassenger(Passenger p){
        if (this.passengeronboard.contains(p)){
            this.currentpassengers -= 1;
            this.passengeronboard.remove(p);
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }
    }

    /**
     * Prints the manifest of passengers currently on board.
     * If there are no passengers, prints a message indicating the car is empty.
     * Otherwise, prints the name of each passenger in the order they were added.
     */
    public void printManifest(){
        if (this.currentpassengers == 0){
            System.out.println("This car is EMPTY.");
        }
        for(int i=0;i<this.passengeronboard.size();i++){
            
            System.out.println(this.passengeronboard.get(i).getname());
            
        }

    }

    //compile the class
    public static void main(String[] args) {
        Car mycar = new Car(1);
        Passenger onePassenger = new Passenger("Anna");
        Passenger bob = new Passenger("bob");
        mycar.removePassenger(onePassenger);
        mycar.printManifest();

    }



   }



