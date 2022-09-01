package com.springbootrestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootrestful.entites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
