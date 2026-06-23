package com.staynest.demo.entities;

import java.time.LocalDateTime;

import com.staynest.demo.enums.ChangeType;

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
public class FolioItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer FolioItemId;
	
	@ManyToOne
	@JoinColumn(name = "stay_id")
	private StayRecord stayRecordId;
	
	@Enumerated(EnumType.STRING)
	private ChangeType changeType;
	
	private String description;
	private Integer amount;
	private	LocalDateTime postedDate;
	
	@ManyToOne
	@JoinColumn(name = "posted_by")
	private Users postedBy;
}
