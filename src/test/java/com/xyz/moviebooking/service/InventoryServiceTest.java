
package com.xyz.moviebooking.service;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.xyz.moviebooking.repo.ShowSeatRepo;
import org.mockito.Mockito;

import java.util.*;

class InventoryServiceTest {

    private InventoryService inventoryService;

    private ShowSeatRepo repo;

    @BeforeEach
    void setUp() {
        repo = Mockito.mock(ShowSeatRepo.class);
        inventoryService = new InventoryService(repo);
    }

    @Test
    void testLockSeats() {
        assertDoesNotThrow(() -> inventoryService.lock(1L, Arrays.asList(1L,2L), 100L));
    }
}
