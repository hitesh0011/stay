package com.staynest.demo.entities;

import java.time.LocalDateTime;
import com.staynest.demo.enums.ReportScope;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HospitalityReport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reportId;

	@JoinColumn(name = "room_id")
	private Room room;
	
	@Enumerated(EnumType.STRING)
	private ReportScope scope;

	private String metricsJson;
	private LocalDateTime generatedDate;
}