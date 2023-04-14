package com.TODO.services;


import com.TODO.Componets.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TODO.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public void saveUser(User user){
        user.setCreation(new Date());
        userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
    public List<User> getALLByLogin(String login){
        return userRepository.findByLogin(login);
    }
    public boolean existByLogin(String login){
        return userRepository.existByLogin(login);
    }
}

