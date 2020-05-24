package co.interleap.courses.tdd;


import java.util.List;

public class Invoice {

    private List<Ride> rides;

    public Invoice(List<Ride> rides) {
        this.rides = rides;
    }

    public double getTotalFare() {
        Double totalFare = 0.0;
        for(Ride ride : rides) {
            totalFare += ride.getTotalFare(); //solves the problem of feature envy.
        }
        return totalFare;
    }

    public int getTotalNumberOfRides() {
        return rides.size();
    }

    public double getAvgFarePerRide() {
        return getTotalFare() / getTotalNumberOfRides();
    }
}

