package co.interleap.courses.tdd;


import co.interleap.courses.vo.Ride;

import java.util.List;

public class InvoiceGenerator {

    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MIN = 1;

    public Double generateInvoice(List<Ride> rideDetails) {

        Double totalFare = 0.0;
        for(Ride ride : rideDetails)
            totalFare += getFare(ride.getDistance(), ride.getTime());

        return totalFare;
    }

    private Double getFare(Double distance, Double time) {
        if (distance < 0 || time < 0)
            return 0.0;

        return (FARE_PER_KM * distance + (FARE_PER_MIN * time));
    }
}

