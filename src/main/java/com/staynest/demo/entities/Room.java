package com.staynest.demo.entities;

import com.staynest.demo.enums.RoomStatus;

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
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomId;
	
	private Integer roomNumber;
	private Integer floor;
	
	@ManyToOne
	@JoinColumn(name = "room_type_id")
	private RoomType roomType;
	
	@Enumerated(EnumType.STRING)
	private RoomStatus roomStatus;
}
