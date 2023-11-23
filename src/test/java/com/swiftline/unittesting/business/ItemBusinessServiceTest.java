package com.swiftline.unittesting.business;

import com.swiftline.unittesting.data.ItemRepository;
import com.swiftline.unittesting.model.Item;
import com.swiftline.unittesting.service.ItemBusinessService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ItemBusinessServiceTest {

    @InjectMocks
    private ItemBusinessService business;

    @Mock
    ItemRepository repository;

    @Test
    void calculateSumUsingDataService_basic() {
        when(repository.findAll()).thenReturn(Arrays.asList(
                new Item(2, "Item2", 10, 10),
                new Item(3, "Item3", 20, 20)
        ));

        var sut = business.retrieveAllItems();

        assertEquals(100, sut.get(0).getValue());
        assertEquals(400, sut.get(1).getValue());
    }
}
