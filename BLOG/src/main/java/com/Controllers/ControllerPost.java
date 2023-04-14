package Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.components.Post;

@RestController
@RequestMapping("/api/posts")
public class ControllerPost {

    @Autowired
    private ControllerPost postRepository;

    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable("id") long id) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isPresent()) {
            return new ResponseEntity<>(post.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        post.getDataCreation(LocalDateTime.now());
        post.getDataCreation(LocalDateTime.now());
        post.getDataCreation(LocalDateTime.now());
        Post savedPost = postRepository.save(post);
        return new ResponseEntity<>(savedPost, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable("id") long id, @RequestBody Post post) {
        Optional<Post> currentPost = postRepository.findById(id);
        if (currentPost.isPresent()) {
            Post updatedPost = currentPost.get();
            updatedPost.setName(post.getName());
            updatedPost.setDescription(post.getDescription());
            updatedPost.setCategory(post.getCategory());
            updatedPost.setUser(post.getUser());
            updatedPost.getDataUpdate(LocalDateTime.now());
            postRepository.save(updatedPost);
            return new ResponseEntity<>(updatedPost, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable("id") long id) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isPresent()) {
            postRepository.delete(post.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}