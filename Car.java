import java.util.ArrayList;

public class Car {

    

    //Attributes
    private int Capacity;
    private ArrayList<Passenger> Passengeronboard;
    private int Currentpassengers;

    //constructor
    public Car(int Capacity){
        this.Capacity = Capacity;
        this.Passengeronboard = new ArrayList<Passenger>(Capacity);
        this.Currentpassengers = 0;
    }
        
        
    public int getCapacity(){
        return this.Capacity;
    }

    public int seatsRemaining(){
        return this.Capacity - this.Currentpassengers;
    }

    public boolean addPassenger(Passenger p){
        if (seatsRemaining() > 0){
            this.Currentpassengers += 1;
            this.Passengeronboard.add(p);
            return true;    
        }
        return false;
    }

    public boolean removePassenger(Passenger p){
        if (this.Passengeronboard.contains(p)){
            this.Currentpassengers -= 1;
            this.Passengeronboard.remove(p);
            return true;
        }
        return false;
    }

    public void printManifest(){
        if (this.Currentpassengers == 0){
            System.out.println("This car is EMPTY.");
        }
        for(int i=0;i<this.Passengeronboard.size();i++){
            
            System.out.println(this.Passengeronboard.get(i).getname());
            
        }

    }

    public static void main(String[] args) {
        Car mycar = new Car(100);
        mycar.printManifest();
        mycar.seatsRemaining();
        mycar.addPassenger(p);
    }



   }



