package com.staynest.demo.entities;

import java.time.LocalDateTime;
import com.staynest.demo.enums.OrderStatus;
import com.staynest.demo.enums.OrderType;
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
public class FBOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;

	@ManyToOne
	@JoinColumn(name = "stay_id")
	private StayRecord stayRecord;

	private Integer tableNumber;

	@Enumerated(EnumType.STRING)
	private OrderType orderType;

	private String itemsJson;
	private Integer totalAmount;
	private LocalDateTime orderTime;

	@Enumerated(EnumType.STRING)
	private OrderStatus status;
}