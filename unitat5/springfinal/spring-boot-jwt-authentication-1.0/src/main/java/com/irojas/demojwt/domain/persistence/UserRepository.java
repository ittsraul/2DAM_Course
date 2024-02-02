package com.irojas.demojwt.domain.persistence;

import java.util.Optional;

import com.irojas.demojwt.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username); 
}
