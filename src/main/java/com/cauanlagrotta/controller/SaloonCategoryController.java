package com.cauanlagrotta.controller;


import com.cauanlagrotta.dto.SaloonDTO;
import com.cauanlagrotta.model.Category;
import com.cauanlagrotta.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories/saloon-owner")
@RequiredArgsConstructor
public class SaloonCategoryController {

  private final CategoryService categoryService;

  @PostMapping
  public ResponseEntity<Category> getCategoriesBySaloon(@RequestBody Category category){

    SaloonDTO saloonDTO = new SaloonDTO();
    saloonDTO.setId(1L);
    Category savedCategory = categoryService.create(category, saloonDTO);
    return ResponseEntity.ok(savedCategory);
  }

  @DeleteMapping("/{categoryId}")
  public ResponseEntity<Void> deleteCategory(@PathVariable Long categoryId){
    SaloonDTO saloonDTO = new SaloonDTO();
    saloonDTO.setId(1L);

    categoryService.delete(categoryId, saloonDTO.getId());
    return ResponseEntity.noContent().build();
  }
}
