package com.swiftline.unittesting.business;

import com.swiftline.unittesting.data.SomeDataService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockTest {

    @InjectMocks
    SomeBusinessImpl business;

    @Mock
    SomeDataService dataServiceMock;

//    @BeforeEach
//    public void before() {
//        business.setSomeDataService(dataServiceMock);
//    }

    @Test
    void calculateSumUsingDataService_basic() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1,2,3});

        assertEquals(business.calculateSumUsingDataService(), 6);
    }

    @Test
    void calculateSumUsingDataService_empty() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});

        assertEquals(business.calculateSumUsingDataService(), 0);
    }

    @Test
    void calculateSumUsingDataService_oneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});

        assertEquals(business.calculateSumUsingDataService(), 5);
    }
}
