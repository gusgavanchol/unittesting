package com.swiftline.unittesting.spike;

import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

class JsonAssertTest {
    String actualReponse = "{\"id\": 1,\"description\":\"Ball\",\"price\":10.0,\"quantity\":100}";

    @Test
    void jsonAssert_StrictTrue() throws Exception {
        String expectedResponse = "{\"id\":1,\"description\":\"Ball\",\"price\":10.0,\"quantity\":100}";
        JSONAssert.assertEquals(expectedResponse, actualReponse, true);
    }

    @Test
    void jsonAssert_StrictFalse() throws Exception {
        String expectedResponse = "{\"id\":1,\"description\":\"Ball\",\"quantity\":100}";
        JSONAssert.assertEquals(expectedResponse, actualReponse, false);
    }

    @Test
    void jsonAssert_WithoutEscapeCharacters() throws Exception {
        String expectedResponse = "{id: 1, description: Ball, quantity :100}";
        JSONAssert.assertEquals(expectedResponse, actualReponse, false);
    }
}
