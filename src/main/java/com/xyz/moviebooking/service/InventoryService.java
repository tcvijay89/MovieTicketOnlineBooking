package com.xyz.moviebooking.service;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import java.util.*;import java.time.*;
import com.xyz.moviebooking.repo.*;
import com.xyz.moviebooking.entity.*;
import com.xyz.moviebooking.common.*;
@Service
public class InventoryService{
private final ShowSeatRepo repo;
public InventoryService(ShowSeatRepo r){this.repo=r;}
@Transactional
public void lock(Long showId,List<Long> seatIds,Long bookingId){
var seats=repo.findByShowIdAndSeatIdIn(showId,seatIds);
for(var s:seats){
 if(s.status==SeatStatus.BOOKED) throw new RuntimeException("Already booked");
 s.status=SeatStatus.LOCKED;
 s.bookingId=bookingId;
 s.expiry=LocalDateTime.now().plusMinutes(5);
}
repo.saveAll(seats);
}
@Transactional
public void confirm(Long bookingId){
var seats=repo.findByBookingId(bookingId);
for(var s:seats){s.status=SeatStatus.BOOKED;}
repo.saveAll(seats);
}
}
