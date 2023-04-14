package com.TODO.Controllers;

import java.util.List;
import java.util.NoSuchElementException;

import com.TODO.Componets.Category;
import com.TODO.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    
    @GetMapping("")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable Integer id){
        try{
            Category category = categoryService.getCategoryById(id);
            return new ResponseEntity<Category>(category, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/") //добавить категорию
    public void addCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
    }

    @DeleteMapping("/{id}")   //удалить категории
    public void deleteCategory(@PathVariable Integer id){
        categoryService.deleteCategory(id);
    }
}
