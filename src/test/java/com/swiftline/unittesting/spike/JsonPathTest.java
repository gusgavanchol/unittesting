package com.swiftline.unittesting.spike;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class JsonPathTest {

    @Test
    void learning() {
        String responseFromService = "[" +
                " {\"id\": 1, \"name\": \"Pencil\", \"quantity\": 5 }," +
                " {\"id\": 2, \"name\": \"Pen\", \"quantity\": 15 }," +
                " {\"id\": 3, \"name\": \"Eraser\", \"quantity\": 10 }" +
                "]";

        DocumentContext context = JsonPath.parse(responseFromService);
        var length = context.read("$.length()");
        assertThat(length).isEqualTo(3);

        List<Integer> ids = context.read("$..id");
        assertThat(ids).containsExactly(1,2,3);

        System.out.println(context.read("$..id").toString());
    }
}
