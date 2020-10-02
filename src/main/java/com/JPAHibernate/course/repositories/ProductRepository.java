package com.JPAHibernate.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPAHibernate.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
