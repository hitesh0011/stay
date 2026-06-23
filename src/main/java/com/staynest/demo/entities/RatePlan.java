package com.staynest.demo.entities;

import java.sql.Date;

import com.staynest.demo.enums.RatePlanStatus;
import com.staynest.demo.enums.RatePlanType;

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
public class RatePlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ratePlanId;
	
	@ManyToOne
	@JoinColumn(name = "room_type_id")
	private RoomType roomType;
	
	@Enumerated(EnumType.STRING)
	private RatePlanType ratePlanType;
	
	private Integer pricePerNight;
	private Date validFrom;
	private Date validTo;
	
	private Boolean mealPlanIncluded;
	
	@Enumerated(EnumType.STRING)
	private RatePlanStatus ratePlanStatus;
}