package co.interleap.courses.tdd;


import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {

    @Test
    public void shouldTestEmptyKilometersValue(){
        Assert.assertEquals(0, new InvoiceGenerator().generateInvoice(0,0));
    }

    @Test
    public void shouldTestEmptyMinutesValue() {
        Assert.assertEquals(0, new InvoiceGenerator().generateInvoice(0,0));
    }

    @Test
    public void shouldTestWithSingleValueForKilometers() {
        Assert.assertEquals(11, new InvoiceGenerator().generateInvoice(1,1));
        Assert.assertEquals(22, new InvoiceGenerator().generateInvoice(2,2));
    }

    @Test
    public void shouldTestWithLargeValueForKilometersAndMinutes() {
        Assert.assertEquals(150, new InvoiceGenerator().generateInvoice(10,50));
    }

    @Test
    public void shouldTestWithNegativeValueForKilometers() {
        Assert.assertEquals(0, new InvoiceGenerator().generateInvoice(-1,50));
    }

    @Test
    public void shouldTestWithNegativeValueForMinutes() {
        Assert.assertEquals(0, new InvoiceGenerator().generateInvoice(10,-50));
    }

    @Test
    public void shouldTestWithBothNegativeValue() {
        Assert.assertEquals(0, new InvoiceGenerator().generateInvoice(-10,-50));
    }
}
