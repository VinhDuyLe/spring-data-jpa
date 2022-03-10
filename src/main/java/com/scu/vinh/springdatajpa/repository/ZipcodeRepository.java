package com.scu.vinh.springdatajpa.repository;

import com.scu.vinh.springdatajpa.model.Zipcode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipcodeRepository extends CrudRepository<Zipcode, Long> {

}
