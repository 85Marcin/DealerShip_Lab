package dealershipManagment.Dealership;

import dealershipManagment.Behaviours.IPurchase;
import dealershipManagment.Vehicles.Vehicle;
import dealershipManagment.People.Customer;

import java.util.ArrayList;

public class Dealership implements IPurchase {


    private ArrayList<Vehicle> carsForSale;
    private double till;

    public Dealership(double till, ArrayList<Vehicle> carsForSale){
        this.till = till;
        this.carsForSale = carsForSale;
    }


    public ArrayList<Vehicle> getCarsForSale() {
        return this.carsForSale;
    }

    public int getNumberOfCarsForSale(){
        return carsForSale.size();
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void purchase(Customer customer, Vehicle vehicle){
        double priceOfCar = vehicle.getCarPrice();
        if (carsForSale.contains(vehicle)) {
            if (customer.getMoney() >= priceOfCar){
                till += priceOfCar;
                carsForSale.remove(vehicle);
            }
        }

    };


}
