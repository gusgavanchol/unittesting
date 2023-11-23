package com.swiftline.unittesting.business;

import com.swiftline.unittesting.data.SomeDataService;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class SomeBusinessImpl {
    SomeDataService someDataService;

    public Integer calculateSum(Integer[] data) {
        return Arrays.stream(data).reduce(Integer::sum).orElse(0);
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
