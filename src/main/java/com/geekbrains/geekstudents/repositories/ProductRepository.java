package com.geekbrains.geekstudents.repositories;

import com.geekbrains.geekstudents.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
    @Query(value = "select cat_id, item from products where id = ?1", nativeQuery = false)
    Product myQuery(Long cat_id);


    List<Product> findAllById(Long cat_id);


}

