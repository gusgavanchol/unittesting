package com.swiftline.unittesting.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeBusinessTest {

    @Test
    void calculateSum_basic() {
        SomeBusinessImpl business = new SomeBusinessImpl();

        int actualResult = business.calculateSum(new Integer[] { 1,2,3});

        assertEquals(actualResult, 6);
    }

    @Test
    void calculateSum_empty() {
        SomeBusinessImpl business = new SomeBusinessImpl();

        int actualResult = business.calculateSum(new Integer[] { });

        assertEquals(actualResult, 0);
    }
}
