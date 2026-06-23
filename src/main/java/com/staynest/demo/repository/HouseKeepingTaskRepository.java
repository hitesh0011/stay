package com.staynest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staynest.demo.entities.HouseKeepingTask;
import com.staynest.demo.enums.TaskStatus;

public interface HouseKeepingTaskRepository extends JpaRepository<HouseKeepingTask, Integer> {

	List<HouseKeepingTask> findByRoomId(Integer roomId);
	List<HouseKeepingTask> findByStatus(TaskStatus taskStatus);
}
