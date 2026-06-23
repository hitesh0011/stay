package com.staynest.demo.entities;

import java.time.LocalDateTime;
import com.staynest.demo.enums.NotificationCategory;
import com.staynest.demo.enums.NotificationStatus;
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
public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer notificationId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;

	private String message;

	@Enumerated(EnumType.STRING)
	private NotificationCategory category;

	@Enumerated(EnumType.STRING)
	private NotificationStatus status;

	private LocalDateTime createdDate;
}