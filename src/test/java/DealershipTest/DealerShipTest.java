package DealershipTest;

import dealershipManagment.CarComponents.Engine;
import dealershipManagment.Dealership.Dealership;
import dealershipManagment.People.Customer;
import dealershipManagment.Vehicles.DieselCar;
import dealershipManagment.Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerShipTest {

    Dealership dealership;
    DieselCar car1;
    Customer customer1;
    DieselCar dieselCar1;
    Engine engine1;

    @Before
    public void setUp(){
        ArrayList<Vehicle> carsForSale = new ArrayList<>();
        carsForSale.add(car1);
        dealership = new Dealership(200000, carsForSale);
        engine1 = new Engine(1.9, 2000);
        dieselCar1 = new DieselCar(15000, "negro", engine1 );
        customer1 = new Customer (50000);

    }

    @Test
    public void canReturnNumberOfCarsForSale(){
        assertEquals(1, dealership.getNumberOfCarsForSale());
    }

    @Test
    public void canGetTill(){
        assertEquals(200000, dealership.getTill(), 00);
    }

//    @Test
//    public void canPurchase(){
//        dealership.purchase();
//
//
//
//
//
//
//    }

}
