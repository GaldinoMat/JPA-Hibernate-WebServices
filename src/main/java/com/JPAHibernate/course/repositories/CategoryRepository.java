package com.JPAHibernate.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPAHibernate.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
