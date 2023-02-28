package dealershipManagment.Vehicles;
import dealershipManagment.Behaviours.ISell;
import dealershipManagment.CarComponents.*;

import java.awt.*;

public abstract class Vehicle implements ISell {

    private double price;
    private String color;
    private Engine engine;


    public Vehicle(double price, String color, Engine engine){
        this.price = price;
        this.color = color;
        this.engine = engine;
    }

    public double getCarPrice() {
        return price;
    }

    public void setCarPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice(){
        return  this.price + this.engine.getPrice();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public abstract double sell(Vehicle vehicle);

}
