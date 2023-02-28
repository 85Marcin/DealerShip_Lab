package dealershipManagment.Vehicles;
import dealershipManagment.CarComponents.*;
public class HybridCar extends Vehicle {

    public HybridCar(double price, String color, Engine engine){
        super(price, color, engine);
    }

    public double sell(Vehicle vehicle){
        return vehicle.getCarPrice();

    }
}