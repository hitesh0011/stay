package com.staynest.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staynest.demo.entities.StayRecord;
import com.staynest.demo.enums.StayRecordStatus;

public interface StayRecordRepository extends JpaRepository<StayRecord, Integer>{

	Optional<StayRecord> findByReservationId(Integer ReservationId);
	List<StayRecord> findByStatus(StayRecordStatus status);
}
