package co.interleap.courses.tdd;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InvoiceGeneratorTest {

    @Test
    public void shouldGenerateInvoiceForGivenATime(){
        List<Ride> rideDetails = new ArrayList<>();
        Invoice invoice = new Invoice(rideDetails);
        assertEquals(0,invoice.getTotalFare(),0.1);
    }


    @Test
    public void shouldGenerateInvoiceForGivenDistanceAndTime() {
        List<Ride> rideDetails = new ArrayList<>();
        rideDetails.add(new Ride(3.0, 5.0));

        Invoice invoice = new Invoice(rideDetails);
        assertEquals(35,invoice.getTotalFare(),0.1);
    }


    @Test
    public void shouldTestWithBothNegativeValue() {
        List<Ride> rideDetails = new ArrayList<>();
        rideDetails.add(new Ride(-3.0, 5.0));
        rideDetails.add(new Ride(3.0, -5.0));
        rideDetails.add(new Ride(-3.0, -5.0));

        Invoice invoice = new Invoice(rideDetails);
        assertEquals(0,invoice.getTotalFare(),0.1);
    }

    @Test
    public void shouldTestForMultipleRides() {
        List<Ride> rideDetails = new ArrayList<>();
        rideDetails.add(new Ride(3.0, 4.0));
        rideDetails.add(new Ride(5.0, 30.0));

        Invoice invoice = new Invoice(rideDetails);

        assertEquals(114, invoice.getTotalFare(),0.1);
        assertEquals(2, invoice.getTotalNumberOfRides(),0.1);
        assertEquals(57, invoice.getAvgFarePerRide(),0.1);
    }
}
