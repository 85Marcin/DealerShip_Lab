package CarComponenetsTest;

import dealershipManagment.CarComponents.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;
    @Before
    public void setUp(){
        engine = new Engine(2.1, 5000 ) ;
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2.1, engine.getCapacity(), 0.0);

    }
    @Test
    public void canGetPrice(){
        assertEquals(5000, engine.getPrice(), 0.0);
    }
    @Test
    public void canSetPrice(){
        engine.setPrice(6000);
        assertEquals(6000, engine.getPrice(), 0.0);
    }
}
