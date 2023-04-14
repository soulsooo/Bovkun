package com.blog.components;

import java.time.Instant;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "categories")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String categoryName;


    @CreationTimestamp   //добавляет время создания автоматически
    private Instant dataCreation;

    @UpdateTimestamp  //добавляет время последнего изменения автоматически
    private Instant dataUpdate;


    @JsonIgnore
    @ManyToMany(mappedBy = "categories") //связь многие ко многим с posts
    private Set<Post> posts;
    

}






























