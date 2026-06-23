package com.staynest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staynest.demo.entities.Notification;
import com.staynest.demo.enums.NotificationStatus;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

	List<Notification> findByUserId(Integer userId);
	List<Notification> findByStatus(NotificationStatus status);	
}
