package com.cauanlagrotta.service.impl;

import com.cauanlagrotta.dto.SaloonDTO;
import com.cauanlagrotta.model.Category;
import com.cauanlagrotta.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService {

  @Override
  public Category create(Category category, SaloonDTO saloon) {
    return null;
  }

  @Override
  public Set<Category> getAllBySaloonId(Long saloonId) {
    return Set.of();
  }

  @Override
  public Category getById(Long id) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
