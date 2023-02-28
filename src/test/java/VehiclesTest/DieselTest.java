package VehiclesTest;

import dealershipManagment.CarComponents.Engine;
import dealershipManagment.Vehicles.DieselCar;
import dealershipManagment.Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DieselTest {

    DieselCar dieselCar;



    @Before
    public void setUp(){
        dieselCar = new DieselCar(25000, "pink", new Engine(3.3, 500));

    }

    @Test
    public void canGetPrice(){
        assertEquals(25000, dieselCar.getCarPrice(), 0.0);
    }
    @Test
    public void canGetTotalPrice(){
        assertEquals(25500, dieselCar.getTotalPrice(), 0.0);
    }
    @Test
    public void canGetColor(){
        assertEquals("pink", dieselCar.getColor());
    }
    @Test
    public void hasEngine(){
//        Engine newEngine = new Engine(4.3, 400);
//        Vehicle dieselCar2  = new DieselCar(25000, "pink", newEngine);
//        assertTrue( newEngine instanceof Engine);
        assertTrue(dieselCar.getEngine() instanceof Engine);
    }
}
