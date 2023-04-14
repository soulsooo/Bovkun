package com.TODO.services;


import com.TODO.Componets.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TODO.repositories.TaskRepository;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getALL(){
        return taskRepository.findAll();
    }
    public void saveTask(Task task){
        task.setCreation();e(new Date());
        taskRepository.save(task);
    }
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
    public List<Task> getALLById(Long id){
        return taskRepository.findByUserId(id);
    }
    public boolean existById(Long id){
        return taskRepository.existById(id);
    }
}