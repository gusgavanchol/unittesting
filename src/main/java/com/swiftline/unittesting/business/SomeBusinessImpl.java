package com.swiftline.unittesting.business;

import com.swiftline.unittesting.data.SomeDataService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SomeBusinessImpl {
    SomeDataService someDataService;

    public Integer calculateSum(Integer[] data) {
        int sum = 0;
        for(int value: data) {
            sum += value;
        }
        return sum;
    }

    public Integer calculateSumUsingDataService() {
        int sum = 0;
        int[] data = someDataService.retrieveAllData();
        for(int value: data) {
            sum += value;
        }
        return sum;
    }
}
