package dealershipManagment.People;


import dealershipManagment.Behaviours.IPurchase;
import dealershipManagment.Business.Dealership;
import dealershipManagment.Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements IPurchase {
    private double money;
    private ArrayList<Vehicle> ownedCars;


    public Customer(double money){
        this.money = money;
        this.ownedCars = new ArrayList<>();
    }

    public void addCar( Vehicle newCar){
        if (newCar != null) {
            ownedCars.add(newCar);
        }
    }

    public double getMoney() {
        return money;
    }


    public double reduceMoney(double price){
        return money - price;
    }

    public ArrayList<Vehicle> getCars() {
        return ownedCars;
    }

    public void setCars(ArrayList<Vehicle> cars) {
        this.ownedCars = cars;
    }

    public int getNumberOfOwnedCars(){
        return ownedCars.size();
    }

    public void purchase(Dealership dealership, Vehicle vehicle){
        double priceOfCar = vehicle.getCarPrice();
            if (getMoney() >= priceOfCar){
                reduceMoney(priceOfCar);
                addCar(vehicle);
            }
        }

    };



}
