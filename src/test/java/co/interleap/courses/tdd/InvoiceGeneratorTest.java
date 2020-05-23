package co.interleap.courses.tdd;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InvoiceGeneratorTest {

    @Test
    public void shouldGenerateInvoiceForGivenATime(){
        List<Ride> rideDetails = new ArrayList<>();
        assertEquals(0,new InvoiceGenerator().generateInvoice(rideDetails),0.1);
    }


    @Test
    public void shouldGenerateInvoiceForGivenDistanceAndTime() {
        List<Ride> rideDetails = new ArrayList<>();
        rideDetails.add(new Ride(3.0, 5.0));
        assertEquals(35,new InvoiceGenerator().generateInvoice(rideDetails),0.1);
    }


    @Test
    public void shouldTestWithBothNegativeValue() {
        List<Ride> rideDetails = new ArrayList<>();
        rideDetails.add(new Ride(-3.0, 5.0));
        rideDetails.add(new Ride(3.0, -5.0));
        rideDetails.add(new Ride(-3.0, -5.0));

        assertEquals(0, new InvoiceGenerator().generateInvoice(rideDetails),0.1);
    }

    @Test
    public void shouldTestForMultipleRides() {
        List<Ride> rideDetails = new ArrayList<>();
        rideDetails.add(new Ride(3.0, 3.0));
        rideDetails.add(new Ride(5.0, 30.0));

        assertEquals(113, new InvoiceGenerator().generateInvoice(rideDetails),0.1);
    }
}
