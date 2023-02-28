package dealershipManagment.CarComponents;

public class Engine extends CarComponent {

    private double capacity;

    public Engine(double capacity, double price){
        super(price);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
