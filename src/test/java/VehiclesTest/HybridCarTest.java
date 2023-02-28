package VehiclesTest;

import dealershipManagment.CarComponents.Engine;
import dealershipManagment.Vehicles.ElectricCar;

import dealershipManagment.Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HybridCarTest {

    HybridCar hybridCar;



    @Before
    public void setUp(){
        hybridCar = new HybridCar(60000, "azul", new Engine(3.3, 500));

    }

    @Test
    public void canGetPrice(){
        assertEquals(60000, hybridCar.getCarPrice(), 0.0);
    }
    @Test
    public void canGetTotalPrice(){
        assertEquals(60500, hybridCar.getTotalPrice(), 0.0);
    }
    @Test
    public void canGetColor(){
        assertEquals("azul", hybridCar.getColor());
    }
    @Test
    public void hasEngine(){
        assertTrue(hybridCar.getEngine() instanceof Engine);
    }
}
