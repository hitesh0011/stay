package com.staynest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.staynest.demo.entities.RatePlan;

@Repository
public interface RatePlanRepository extends JpaRepository<RatePlan, Integer> {

	List<RatePlan> findByRoomTypeId(Integer roomTypeId);
}
