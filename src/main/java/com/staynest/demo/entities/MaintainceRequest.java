package com.staynest.demo.entities;

import java.time.LocalDateTime;

import com.staynest.demo.enums.MaintainceRequestStatus;
import com.staynest.demo.enums.Priority;

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
public class MaintainceRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestId;
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;
	
	@ManyToOne
	@JoinColumn(name = "reported_by")
	private Users reportedBy;
	
	private String issueDescription;
	
	@Enumerated(EnumType.STRING)
	private Priority priority;
	
	private LocalDateTime raisedDate;
	private LocalDateTime resolvedDate;
	
	@Enumerated(EnumType.STRING)
	private MaintainceRequestStatus status;
}