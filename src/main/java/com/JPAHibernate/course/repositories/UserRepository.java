package com.JPAHibernate.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPAHibernate.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
