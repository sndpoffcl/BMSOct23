package com.scaler.BookMyShowOct23.repository;

import com.scaler.BookMyShowOct23.models.ShowSeat;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    ShowSeat save(ShowSeat seat);
}
