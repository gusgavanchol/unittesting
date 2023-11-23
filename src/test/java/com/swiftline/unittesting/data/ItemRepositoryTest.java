package com.swiftline.unittesting.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class ItemRepositoryTest {
    @Autowired
    ItemRepository repository;

    @Test
    void testFindAll() {
        var sut = repository.findAll();

        assertEquals(3, sut.size());
    }
}
