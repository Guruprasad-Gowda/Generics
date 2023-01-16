package com.genericsmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void floatMax1() {
        float actualValue = Maximum.getmaximum(12f, 14f, 15.3f);
        Assert.assertEquals(15.3, actualValue, 1);
    }

    @Test
    public void floatMax2() {
        float actualValue = Maximum.getmaximum(1000f, 545f, 746f);
        Assert.assertEquals(1000, actualValue, 0);
    }
}