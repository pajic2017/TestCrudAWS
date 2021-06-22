package com.may.contact.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.may.contact.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
