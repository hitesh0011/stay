package com.staynest.demo.entities;

import com.staynest.demo.enums.GuestStatus;
import com.staynest.demo.enums.LoyaltyTier;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GuestProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer guestId;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private Users users;
	
	private String nationality;
	private String idDocumentType;
    private String idNumber;
    private String preferencesJson;
    
    @Enumerated(EnumType.STRING)
    private LoyaltyTier loyaltyTier;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;
    
//    @OneToMany(mappedBy = "guest")
//    private Reservation reservation;
}
