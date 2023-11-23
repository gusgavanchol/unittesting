package com.swiftline.unittesting.service;

import com.swiftline.unittesting.data.ItemRepository;
import com.swiftline.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemBusinessService {
    @Autowired
    ItemRepository repository;

    public Item retrieveHardcodedItem() {
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retrieveAllItems() {
        var items = repository.findAll();
        for(Item item: items) {
            item.setValue(item.getPrice() * item.getQuantity());
        }

        return repository.findAll();
    }
}
