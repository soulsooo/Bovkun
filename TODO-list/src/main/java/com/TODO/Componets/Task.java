package com.TODO.Componets;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tasks")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    private String name;

    private String description;

    private LocalDate DateFinish;

    @Column(columnDefinition = "boolean default false")

    private Boolean completed;

    @CreationTimestamp
    private Instant Creation;

    @UpdateTimestamp
    private Instant Update;

    @JoinColumn
    @ManyToOne(name = "user_id", nullable = false)
    private User user;

    @JoinTable
    @ManyToMany(
            name = "task_categories",
            joinColumns = {@JoinColumn(name = "task_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")})
    private Set<Category> categories;


    }




