package com.staynest.demo.entities;

import java.util.List;
import com.staynest.demo.enums.MenuCategory;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MenuItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer menuItemId;

	private String name;

	@Enumerated(EnumType.STRING)
	private MenuCategory category;

	private Integer price;
	private Boolean isAvailable;

	@ElementCollection
	private List<String> dietaryTags;
}