package com.swiftline.unittesting.controller;

import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ItemControllerIT {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void contextLoads() throws Exception {

        var response = this.restTemplate.getForObject("/all-items-from-database", String.class);

        JSONAssert.assertEquals("[{id: 1},{id: 2},{id: 3}]", response, false);
    }
}
