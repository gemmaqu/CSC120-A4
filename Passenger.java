public class Passenger {
    
    //attribute
    private String name;

    //constructor
    public Passenger(String name) {
        this.name = name;
    }

    public String getname(){
        return this.name;
    }

    public void boardCar(Car c){
        if (c.addPassenger(p) == Boolean.TRUE) {
            c.addPassenger(p);
        }
    else 