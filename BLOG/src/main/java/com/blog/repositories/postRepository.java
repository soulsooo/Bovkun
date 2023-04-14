package com.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.components.Post;


public interface postRepository extends JpaRepository<Post, Long> {
}