package com.scu.vinh.springdatajpa.repository;

import com.scu.vinh.springdatajpa.model.Book;
import org.hibernate.type.descriptor.sql.LongVarcharTypeDescriptor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
