package com.staynest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staynest.demo.entities.DiningReservation;
import com.staynest.demo.enums.DiningStatus;

public interface DiningReservationRepository extends JpaRepository<DiningReservation, Integer>{

	List<DiningReservation> findByGuestId(Integer guestId);
	List<DiningReservation> findByStatus(DiningStatus status);
}
