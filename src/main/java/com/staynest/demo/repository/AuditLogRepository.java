package com.staynest.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.staynest.demo.entities.AuditLog;
import com.staynest.demo.entities.GuestProfile;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Integer> {
	
	Optional<GuestProfile> findById(String idNumber);
}
