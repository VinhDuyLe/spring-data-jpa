package com.scu.vinh.springdatajpa.service;

import com.scu.vinh.springdatajpa.model.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    public Category getCategory(Long categoryId);
}
