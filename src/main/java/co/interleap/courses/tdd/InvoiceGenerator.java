package co.interleap.courses.tdd;


import java.util.Map;

public class InvoiceGenerator {

    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MIN = 1;

    public double generateInvoice(Map<Double, Double> rideDetails) {

        Double totalFare = 0.0;
        for (Map.Entry<Double, Double> ride : rideDetails.entrySet()) {
            totalFare += (FARE_PER_KM * ride.getKey() + (FARE_PER_MIN * ride.getValue()));
        }
        return totalFare;
    }
}

