package com.staynest.demo.entities;

import java.time.LocalDateTime;

import com.staynest.demo.enums.StayRecordStatus;

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
public class StayRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stayId;
	
	@ManyToOne
	@JoinColumn(name = "reservation")
	private Reservation reservation;
	
	@ManyToOne
	@JoinColumn(name = "guest_id")
	private GuestProfile guest;
	
	@ManyToOne
	@JoinColumn(name = "assigned_room_id")
	private Room assignedRoom;
	
	private LocalDateTime actualCheckIn;
	private LocalDateTime actualCheckOut;
	private Integer folioBalance;
	
	@Enumerated(EnumType.STRING)
	private StayRecordStatus status;
}
