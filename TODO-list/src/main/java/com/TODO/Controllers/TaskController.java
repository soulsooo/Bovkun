package com.TODO.Controllers;

import java.util.List;
import java.util.NoSuchElementException;

import com.TODO.Componets.Task;
import com.TODO.Componets.User;
import com.TODO.services.TaskService;
import com.TODO.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    TaskService taskService;

    @Autowired
    UserService userService;

    @GetMapping("") // получить список всех задач
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}") // получить задачу по id
    public ResponseEntity<Task> getTask(@PathVariable Integer id){
        try{
            Task task = taskService.getTaskById(id);
            return new ResponseEntity<Task>(task, HttpStatus.OK);
        }catch(NoSuchElementException e) {
            return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTask(@RequestBody Task task, @PathVariable Integer id){
        try{
            Task oldTask = taskService.getTaskById(id);
            oldTask.updateTask(task);
            taskService.saveTask(oldTask);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Integer id){
        taskService.deleteTask(id);
    }

    @PostMapping("/by{id}")
    public ResponseEntity<?> addTask(@RequestBody Task task, @PathVariable Integer id){
        try{
            User user = userService.getUserById(id);
            task.setUser(user);
            taskService.saveTask(task);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
