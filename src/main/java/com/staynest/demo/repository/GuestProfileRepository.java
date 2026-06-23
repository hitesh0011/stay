package com.staynest.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staynest.demo.entities.GuestProfile;

public interface GuestProfileRepository extends JpaRepository<GuestProfile, Integer>{

	Optional<GuestProfile> findByUserId(Integer userId);
}
