package co.interleap.courses.tdd;


public class InvoiceGenerator {

    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MIN = 1;

    public double generateInvoice(double distance, double time) {

        if(distance < 0 || time < 0)
            return 0;

        return (FARE_PER_KM * distance + (FARE_PER_MIN * time));
    }
}

