package com.cauanlagrotta.repository;

import com.cauanlagrotta.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  Set<Category> findBySaloonId(Long saloonId);
}
