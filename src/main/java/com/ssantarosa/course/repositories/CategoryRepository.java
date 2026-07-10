package com.ssantarosa.course.repositories;

import com.ssantarosa.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
