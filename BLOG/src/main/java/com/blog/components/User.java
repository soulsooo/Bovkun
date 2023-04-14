package com.blog.components;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String login;
    private String surname;
    private String name;
    private String middleName;
    private LocalDate birthdate;


    @CreationTimestamp
    private Instant dataCreation;

    @UpdateTimestamp
    private Instant dataUpdate;

    @JsonIgnore
    @OneToMany(mappedBy = "user") //связь один ко многим с posts
    private Set<Post> posts;


    public void updateUser(User user){
        if (user.login != null){
            this.login = user.login;
        }
        if(user.surname != null){
            this.surname = user.surname;
        }
        if(user.name != null){
            this.name = user.name;
        }
        if(user.middleName != null){
            this.middleName = user.middleName;
        }
        if(user.birthdate != null){
            this.birthdate = user.birthdate;
        }
    }
}






























