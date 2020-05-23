package co.interleap.courses.tdd;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class InvoiceGeneratorTest {

    @Test
    public void shouldGenerateInvoiceForGivenATime(){
        Map<Double,Double> rideDetails = new HashMap<>();
        assertEquals(0,new InvoiceGenerator().generateInvoice(rideDetails),0.1);
    }


    @Test
    public void shouldGenerateInvoiceForGivenDistanceAndTime() {
        Map<Double,Double> rideDetails = new HashMap<>();
        rideDetails.put(3.0,5.0);
        assertEquals(35,new InvoiceGenerator().generateInvoice(rideDetails),0.1);
    }


}
