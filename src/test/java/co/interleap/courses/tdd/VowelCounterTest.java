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
    public void shouldCountAllVowelsInStringHavingAllVowels() {
        VowelCounter vowelCounter = new VowelCounter();
        Assert.assertEquals(5,vowelCounter.count("aeiou"));
        Assert.assertEquals(2,vowelCounter.count("ee"));
        Assert.assertEquals(10,vowelCounter.count("iiiiiooooo"));
        Assert.assertEquals(1,vowelCounter.count("o"));
        Assert.assertEquals(3,vowelCounter.count("iou"));
    }

    @Test
    public void shouldCountAllVowelsInStringHavingConsonants() {
        VowelCounter vowelCounter = new VowelCounter();
        Assert.assertEquals(1,vowelCounter.count("harsh"));
        Assert.assertEquals(18, vowelCounter.count("write no production code except to pass a failing test."));
    }

    @Test
    public void shouldCountAllVowelsInStringWithCaseSensitive() {
        VowelCounter vowelCounter = new VowelCounter();
        Assert.assertEquals(1,vowelCounter.count("harsh"));
        Assert.assertEquals(1,vowelCounter.count("HARSH"));
        Assert.assertEquals(12, vowelCounter.count("A Quick broWN FOX JUmped over the LAZY DOG."));

    }
}