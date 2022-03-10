package com.scu.vinh.springdatajpa.repository;

import com.scu.vinh.springdatajpa.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
