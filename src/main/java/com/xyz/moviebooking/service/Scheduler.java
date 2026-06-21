package com.xyz.moviebooking.service;
import org.springframework.scheduling.annotation.*;
import org.springframework.stereotype.*;
@Component
public class Scheduler{
@Scheduled(fixedRate=60000)
public void cleanup(){System.out.println("Releasing expired locks...");}
}
