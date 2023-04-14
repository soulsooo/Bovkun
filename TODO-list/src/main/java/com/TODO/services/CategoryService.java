package com.TODO.services;


import com.TODO.Componets.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TODO.repositories.CategoryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public void saveCategory(Category category){
        category.setCreation(new Date());
        categoryRepository.save(category);
    }
    public List<Category> getALL(){
        return categoryRepository.findAll();
    }
    public boolean existById(Long id){
        return categoryRepository.existById(id);
    }
}
