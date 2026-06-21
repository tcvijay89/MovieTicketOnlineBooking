package com.xyz.moviebooking.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.xyz.moviebooking.entity.ShowSeat;
import java.util.*;
public interface ShowSeatRepo extends JpaRepository<ShowSeat,Long>{
List<ShowSeat> findByShowIdAndSeatIdIn(Long s,List<Long> ids);
List<ShowSeat> findByBookingId(Long bookingId);
}
