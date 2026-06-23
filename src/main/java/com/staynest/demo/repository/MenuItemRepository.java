package com.staynest.demo.repository;

import com.staynest.demo.entities.MenuItem;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {
    List<MenuItem> findByIsAvailable(Boolean isAvailable);
}