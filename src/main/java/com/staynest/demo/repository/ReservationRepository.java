package com.staynest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.staynest.demo.entities.Reservation;
import com.staynest.demo.enums.ReservationStatus;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

	List<Reservation> findByGuestId(Integer guestId);
	List<Reservation> findByStatus(ReservationStatus status);
}