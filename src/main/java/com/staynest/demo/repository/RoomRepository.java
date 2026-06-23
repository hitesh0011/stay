package com.staynest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.staynest.demo.entities.Room;
import com.staynest.demo.enums.RoomStatus;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

	List<Room> findByRoomStatus(RoomStatus roomStatus);
	List<Room> findByRoomTypeId(Integer roomTypeId);
}
