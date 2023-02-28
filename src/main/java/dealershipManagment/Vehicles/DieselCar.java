package dealershipManagment.Vehicles;
import dealershipManagment.Behaviours.ISell;
import dealershipManagment.CarComponents.*;
public class DieselCar extends Vehicle{

    public DieselCar(double price, String color, Engine engine){

        super(price, color, engine);
    }


    public double sell(Vehicle vehicle){
        return vehicle.getCarPrice();

    }


}
