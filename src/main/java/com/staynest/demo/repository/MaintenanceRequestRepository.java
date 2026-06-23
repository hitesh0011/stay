package com.staynest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staynest.demo.entities.MaintainceRequest;
import com.staynest.demo.enums.MaintainceRequestStatus;

public interface MaintenanceRequestRepository extends JpaRepository<MaintainceRequest, Integer>{

	List<MaintainceRequest> findByRoomId(Integer roomId);
	List<MaintainceRequest> findByStatus(MaintainceRequestStatus requestStatus);
}
