package com.alzohar.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alzohar.document.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

}
