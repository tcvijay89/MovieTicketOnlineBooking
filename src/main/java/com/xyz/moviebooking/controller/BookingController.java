package com.xyz.moviebooking.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController{
@PostMapping public String book(){return "CONFIRMED";}
}
