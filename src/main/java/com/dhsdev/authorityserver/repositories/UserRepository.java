package com.dhsdev.authorityserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhsdev.authorityserver.security.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
