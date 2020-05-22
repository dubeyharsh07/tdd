package co.interleap.courses.tdd;

import org.junit.Assert;
import org.junit.Test;

public class VowelCounterTest {

    @Test
    public void dummy(){}

    @Test
    public void testEmptyString() {
        Assert.assertEquals(0,new VowelCounter().count(""));
    }

    @Test
    public void shouldCountSingleVowelInString() {
        VowelCounter vowelCounter = new VowelCounter();
        Assert.assertEquals(1,vowelCounter.count("a"));
        Assert.assertEquals(1,vowelCounter.count("e"));
    }

    @Test
    public void shouldCountAllVowelsInStringHavingAllVowles() {
        VowelCounter vowelCounter = new VowelCounter();
        Assert.assertEquals(5,vowelCounter.count("aeiou"));
        Assert.assertEquals(2,vowelCounter.count("ee"));
        Assert.assertEquals(10,vowelCounter.count("iiiiiooooo"));
        Assert.assertEquals(1,vowelCounter.count("o"));
        Assert.assertEquals(3,vowelCounter.count("iou"));
    }
}