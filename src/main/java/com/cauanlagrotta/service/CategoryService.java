package com.cauanlagrotta.service;

import com.cauanlagrotta.dto.SaloonDTO;
import com.cauanlagrotta.model.Category;

import java.util.List;
import java.util.Set;

public interface CategoryService {
  Category create(Category category, SaloonDTO saloon);
  Set<Category> getAllBySaloonId(Long saloonId);
  Category getById(Long id);
  void delete(Long id, Long saloonId);
}
