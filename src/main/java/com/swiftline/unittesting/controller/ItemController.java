package com.swiftline.unittesting.controller;

import com.swiftline.unittesting.model.Item;
import com.swiftline.unittesting.service.ItemBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    ItemBusinessService businessService;

    @GetMapping("/dummy-item")
    public Item helloWorld() {
        return new Item(1, "Ball", 10, 100);
    }

    @GetMapping("/item-from-business-service")
    public Item itemFromBusinessService() {
        return businessService.retrieveHardcodedItem();
    }
}
