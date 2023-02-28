package CarComponenetsTest;

import dealershipManagment.CarComponents.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {
   Tyre tyre;

    @Before
    public void setUp(){
        tyre = new Tyre(600.50);
    }

    @Test
    public void canGetPrice(){
        assertEquals(600.50, tyre.getPrice(), 0.0);
    }
    @Test
    public void canSetPrice(){
        tyre.setPrice(650.66);
        assertEquals(650.66, tyre.getPrice(), 0.0);
    }

}
