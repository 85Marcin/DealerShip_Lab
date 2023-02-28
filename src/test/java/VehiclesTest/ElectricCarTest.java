package VehiclesTest;

import dealershipManagment.CarComponents.Engine;
import dealershipManagment.Vehicles.ElectricCar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ElectricCarTest {

    ElectricCar electricCar;



    @Before
    public void setUp(){
        electricCar = new ElectricCar(40000, "yellow", new Engine(3.3, 500));

    }

    @Test
    public void canGetPrice(){
        assertEquals(40000, electricCar.getCarPrice(), 0.0);
    }
    @Test
    public void canGetTotalPrice(){
        assertEquals(40500, electricCar.getTotalPrice(), 0.0);
    }
    @Test
    public void canGetColor(){
        assertEquals("yellow", electricCar.getColor());
    }
    @Test
    public void hasEngine(){
        assertTrue(electricCar.getEngine() instanceof Engine);
    }
}
