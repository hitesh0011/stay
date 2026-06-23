package com.staynest.demo.entities;

import java.sql.Date;
import java.time.LocalTime;
import com.staynest.demo.enums.DiningStatus;
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
public class DiningReservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer diningResId;

	@ManyToOne
	@JoinColumn(name = "guest_id")
	private GuestProfile guest;

	@ManyToOne
	@JoinColumn(name = "stay_id")
	private StayRecord stayRecord;

	private String restaurantOutlet;
	private Date date;
	private LocalTime time;
	private Integer covers;

	@Enumerated(EnumType.STRING)
	private DiningStatus status;
}