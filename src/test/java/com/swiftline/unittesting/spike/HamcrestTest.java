package com.swiftline.unittesting.spike;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class HamcrestTest {
    @Test
    void learning() {
        List<Integer> numbers = Arrays.asList(12, 15, 45);

        assertThat(numbers, hasSize(3));
        assertThat(numbers, hasItems(12, 45));
        assertThat(numbers, everyItem(greaterThan(10)));

        assertThat("", emptyString());
        assertThat("ABCDE", containsString("BCD"));
        assertThat("ABCDE", startsWith("ABC"));
        assertThat("ABCDEF", endsWith("DEF"));
    }
}
