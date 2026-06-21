
package com.xyz.moviebooking.service;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BookingServiceTest {

    private BookingService bookingService;

    @BeforeEach
    void setup() {
        bookingService = new BookingService(null);
    }

    @Test
    void testBook() {
        String result = bookingService.book();
        assertEquals("CONFIRMED", result);
    }
}
