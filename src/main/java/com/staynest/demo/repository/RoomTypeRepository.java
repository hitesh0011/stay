package com.staynest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.staynest.demo.entities.RoomType;
import com.staynest.demo.enums.RoomTypeStatus;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> {

	List<RoomType> findByRoomTypeStatus(RoomTypeStatus roomTypeStatus);
}