package com.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.components.User;

public interface userRepository extends JpaRepository<User, Long> {
}