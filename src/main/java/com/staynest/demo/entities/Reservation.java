package com.staynest.demo.entities;

import java.sql.Date;

import com.staynest.demo.enums.BookingChannel;
import com.staynest.demo.enums.ReservationStatus;

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
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reservationId;
	
	@ManyToOne
	@JoinColumn(name = "guest_id")
	private GuestProfile guest;
	
	@ManyToOne
	@JoinColumn(name = "room_type_id")
	private RoomType roomTypeId;
	
	@ManyToOne
	@JoinColumn(name = "rate_plan_id")
	private RatePlan ratePlan;
	
	private Date checkInDate;
	private Date checkOutDate;
	private Integer nights;
	private Integer adults;
	private Integer children;
	private Integer totalAmount;
	
	@Enumerated(EnumType.STRING)
	private BookingChannel bookingChannel;
	
	@Enumerated(EnumType.STRING)
	private ReservationStatus reservationStatus;
}
