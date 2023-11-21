package com.swiftline.unittesting.business;

import com.swiftline.unittesting.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeDataServiceStub implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] { 1, 2, 3};
    }
}

class SomeDataServiceEmptyStub implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {};
    }
}

class SomeDataServiceOneElementEmptyStub implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {5};
    }
}

class SomeStubBusinessTest {

    @Test
    void calculateSumUsingDataService_basic() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumUsingDataService();

        assertEquals(actualResult, 6);
    }

    @Test
    void calculateSumUsingDataService_empty() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceEmptyStub());
        int actualResult = business.calculateSumUsingDataService();

        assertEquals(actualResult, 0);
    }

    @Test
    void calculateSumUsingDataService_oneValue() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceOneElementEmptyStub());
        int actualResult = business.calculateSumUsingDataService();

        assertEquals(actualResult, 5);
    }
}
