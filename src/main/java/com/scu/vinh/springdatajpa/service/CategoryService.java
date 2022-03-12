package com.scu.vinh.springdatajpa.service;

import com.scu.vinh.springdatajpa.dto.requestDto.CategoryRequestDto;
import com.scu.vinh.springdatajpa.dto.responseDto.CategoryResponseDto;
import com.scu.vinh.springdatajpa.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    public Category getCategory(Long categoryId);
    public CategoryResponseDto addCategory(CategoryRequestDto categoryRequestDto);
    public CategoryResponseDto getCategoryById(Long categoryId);
    public List<CategoryResponseDto> getCategories();
    public CategoryResponseDto editCategory(Long categoryId, CategoryRequestDto categoryRequestDto);
    public CategoryResponseDto deleteCategory(Long categoryId);
}
