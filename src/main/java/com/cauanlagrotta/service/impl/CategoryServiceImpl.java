package com.cauanlagrotta.service.impl;

import com.cauanlagrotta.dto.SaloonDTO;
import com.cauanlagrotta.model.Category;
import com.cauanlagrotta.repository.CategoryRepository;
import com.cauanlagrotta.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepository categoryRepository;

  @Override
  public Category create(Category category, SaloonDTO saloon) {

    Category newCategory = new Category();
    newCategory.setName(category.getName());
    newCategory.setSaloonId(category.getSaloonId() );
    newCategory.setImage(category.getImage());

    return categoryRepository.save(newCategory);
  }

  @Override
  public Set<Category> getAllBySaloonId(Long saloonId) {
    return categoryRepository.findBySaloonId(saloonId);
  }

  @Override
  public Category getById(Long id) {
    Category category = categoryRepository.findById(id).orElse(null);

    if(category == null){
      throw new RuntimeException("Category not found");
    }

    return category;
  }

  @Override
  public void delete(Long id, Long saloonId) {
    Category category =  getById(id);

    if(!Objects.equals(category.getSaloonId(), saloonId)){
      throw new RuntimeException("You are not allowed to delete this category");
    }

    categoryRepository.deleteById(id);
  }
}
