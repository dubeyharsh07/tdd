package co.interleap.courses.tdd;


public class InvoiceGenerator {

    public int generateInvoice(Integer kms, Integer mins) {

        if(kms < 0 || mins < 0)
            return 0;

        return ((10 * kms) + (1 * mins));
    }
}
