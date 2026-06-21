
package com.xyz.moviebooking.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookingControllerTest {

    @Test
    void testBookingEndpoint() {
        BookingController controller = new BookingController();
        String response = controller.book();
        assertEquals("CONFIRMED", response);
    }
}
