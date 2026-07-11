package com.ssantarosa.course.repositories;

import com.ssantarosa.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
