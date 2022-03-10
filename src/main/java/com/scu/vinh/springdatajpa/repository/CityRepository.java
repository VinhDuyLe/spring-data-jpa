package com.scu.vinh.springdatajpa.repository;

import com.scu.vinh.springdatajpa.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
