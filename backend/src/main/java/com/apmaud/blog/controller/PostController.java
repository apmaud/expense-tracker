//package com.apmaud.blog.controller;
//import com.apmaud.blog.model.Post;
//import com.apmaud.blog.service.PostService;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/posts")
//public class PostController {
//    @Autowired
//    private PostService postService;
//    @GetMapping
//    public ResponseEntity<List<Post>> getAllPosts() {
//        return new ResponseEntity<List<Post>>(postService.allPosts(), HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Post>> getOnePost(@PathVariable ObjectId id) { // converts the {id} in the path to an ObjectId called id
//        return new ResponseEntity<Optional<Post>>(postService.onePost(id), HttpStatus.OK);
//    }
//
//    @PostMapping("/new")
//    public ResponseEntity<Post> postPost(@RequestBody Map<String, String> payload) {
//        return new ResponseEntity<Post>(postService.createPost(payload.get("title"), payload.get("summary"), payload.get("content"), payload.get("poster")), HttpStatus.CREATED);
//    }
//
//
//}
