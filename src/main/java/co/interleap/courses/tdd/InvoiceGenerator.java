package co.interleap.courses.tdd;


import java.util.List;

public class InvoiceGenerator {

    public static Double generateInvoice(List<Ride> rideDetails) {

        Double totalFare = 0.0;
        for(Ride ride : rideDetails)
            totalFare += ride.getTotalFare(); //solves the problem of feature envy.

        return totalFare;
    }

}

