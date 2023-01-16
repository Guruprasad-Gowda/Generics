package com.genericsmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void intMax() {
        int actualValue = Maximum.testMaximum(9, 4, 1);
        Assert.assertEquals(9, actualValue);
    }

    @Test
    public void floatMax() {
        float actualValue = Maximum.testMaximum(1.5f, 9.1f, 4.4f, 5.3f);
        Assert.assertEquals(9.1f, actualValue, 0);
    }

    @Test
    public void stringMax() {
        String actualValue = Maximum.testMaximum("apple", "peach", "banana");
        Assert.assertEquals("peach", actualValue);
    }

    @Test
    public void givenStringValues_WhenGetMaximum_ShouldReturnCorrectValue() {
        String actualResult = Maximum.testMaximum("Apple", "Peach", "Banana", "Mango", "Strawberry");
        Assert.assertEquals("Strawberry", actualResult);
    }
}