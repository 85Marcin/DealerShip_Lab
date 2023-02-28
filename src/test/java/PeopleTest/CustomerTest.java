package PeopleTest;

import dealershipManagment.People.Customer;
import dealershipManagment.Vehicles.DieselCar;
import dealershipManagment.Vehicles.Vehicle;
import dealershipManagment.CarComponents.Engine;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    DieselCar dieselCar1;
    Engine engine1;

    @Before
    public void setUp(){
        engine1 = new Engine(1.9, 2000);
        dieselCar1 = new DieselCar(15000, "negro", engine1 );
        customer = new Customer (50000);
    }

    @Test
    public void canGetMoney(){
        assertEquals(50000, customer.getMoney(), 00);
    }

    @Test
    public void canSetMoney(){
        customer.setMoney(60000);
        assertEquals(60000, customer.getMoney(), 00);
    }

    @Test
    public void canGetOwnedCars(){
        assertEquals(0, customer.getNumberOfOwnedCars());
    }

    @Test
    public void canAddToOwnedCars(){
        customer.addCar(dieselCar1);
        assertEquals(1, customer.getNumberOfOwnedCars());

    }


}
