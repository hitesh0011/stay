package com.staynest.demo.entities;

import java.util.List;

import com.staynest.demo.enums.RoomTypeName;
import com.staynest.demo.enums.RoomTypeStatus;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RoomType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomTypeId;
	
	@Enumerated(EnumType.STRING)
	private RoomTypeName name;
	
	private String bedConfiguration;
	private Integer maxOccpuancy;
	private Integer baseRate;
	
	@ElementCollection
	private List<String> amenitiesList;
	
	@Enumerated(EnumType.STRING)
	private RoomTypeStatus roomTypeStatus;
	
	@OneToMany(mappedBy = "roomType")
	private List<Room> rooms;
}
