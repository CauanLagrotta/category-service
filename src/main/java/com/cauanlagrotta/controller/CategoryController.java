package com.cauanlagrotta.controller;

import com.cauanlagrotta.model.Category;
import com.cauanlagrotta.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

  private final CategoryService categoryService;

  @GetMapping("/saloon/{saloonId}")
  public ResponseEntity<Set<Category>> getCategoriesBySaloon(@PathVariable Long saloonId){

    Set<Category> categories = categoryService.getAllBySaloonId(saloonId);
    return ResponseEntity.ok(categories);
  }

  @GetMapping("/{categoryId}")
  public ResponseEntity<Category> getById(@PathVariable Long categoryId){

    Category category = categoryService.getById(categoryId);
    return ResponseEntity.ok(category);
  }
}
