package com.staynest.demo.entities;

import java.util.List;

import com.staynest.demo.enums.Role;
import com.staynest.demo.enums.UserStatus;

import jakarta.persistence.Column;
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
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Column(unique = true)
	private String email;
	private String password;
	private String phone;
	
	@Enumerated(EnumType.STRING)
	private UserStatus userStatus;
	
	@OneToMany(mappedBy = "users")
	private List<AuditLog> auditlogs;
	
//	@OneToOne(mappedBy = "users")
//	private GuestProfile guestProfile;
}
