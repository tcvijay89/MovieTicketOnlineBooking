package com.xyz.moviebooking.entity;
import javax.persistence.*;import java.time.*;
import com.xyz.moviebooking.common.SeatStatus;
@Entity
public class ShowSeat{
@Id @GeneratedValue Long id;
Long showId; Long seatId;
@Enumerated(EnumType.STRING)
SeatStatus status;
Long bookingId;
LocalDateTime expiry;
@Version Long version;
}
