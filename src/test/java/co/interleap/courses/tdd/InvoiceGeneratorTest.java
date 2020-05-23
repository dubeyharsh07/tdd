package co.interleap.courses.tdd;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvoiceGeneratorTest {

    @Test
    public void shouldTestEmptyDistanceValue(){
        assertEquals(0, new InvoiceGenerator().generateInvoice(0,0),0.1);
    }

    @Test
    public void shouldTestEmptyTimeValue() {
        assertEquals(0, new InvoiceGenerator().generateInvoice(0,0), 0.1);
    }

    @Test
    public void shouldGenerateInvoiceForGivenDistanceAndTime() {
        assertEquals(11, new InvoiceGenerator().generateInvoice(1,1), 0.1);
        assertEquals(22, new InvoiceGenerator().generateInvoice(2,2), 0.1);
    }

    @Test
    public void shouldTestWithNegativeValueForDistance() {
        assertEquals(0, new InvoiceGenerator().generateInvoice(-1,50),0.1);
    }

    @Test
    public void shouldTestWithNegativeValueForTime() {
        assertEquals(0, new InvoiceGenerator().generateInvoice(10,-50),0.1);
    }

    @Test
    public void shouldTestWithBothNegativeValue() {
        assertEquals(0, new InvoiceGenerator().generateInvoice(-10,-50),0.1);
    }
}
