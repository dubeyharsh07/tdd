package co.interleap.courses.tdd;


public class Ride {

    static final int FARE_PER_KM = 10;
    static final int FARE_PER_MIN = 1;

    private final Double distance;

    private final Double time;

    public Ride(Double distance, Double time) {
        this.distance = distance;
        this.time = time;
    }

    Double getTotalFare() {
        if (distance < 0 || time < 0)
            return 0.0;

        return (FARE_PER_KM * distance + (FARE_PER_MIN * time));
    }

}
