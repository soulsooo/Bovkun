package com.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.components.Category;

Репозиторий категория (CategoryRepository):

public interface categoryRepository extends JpaRepository<Category, Long> {
}