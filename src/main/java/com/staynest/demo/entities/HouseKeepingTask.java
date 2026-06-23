package com.staynest.demo.entities;

import java.time.LocalDateTime;

import com.staynest.demo.enums.TaskStatus;
import com.staynest.demo.enums.TaskType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HouseKeepingTask {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskId;
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;
	
	@Enumerated(EnumType.STRING)
	private TaskType taskType;
	
	@ManyToOne
	@JoinColumn(name = "assigned_to_id")
	private Users assignedTo;
	
	private LocalDateTime assignedDate;
	private LocalDateTime completedAt;
	
	@Enumerated(EnumType.STRING)
	private	TaskStatus status;
}
