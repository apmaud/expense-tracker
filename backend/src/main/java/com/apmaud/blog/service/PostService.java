package com.apmaud.blog.service;
import com.apmaud.blog.model.Post;
import com.apmaud.blog.model.User;
import com.apmaud.blog.repository.PostRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    public List<Post> allPosts() {
        return postRepository.findAll();
    }


    public Optional<Post> onePost(ObjectId id) {
        return postRepository.findById(id);
    }

    public Post createPost(String title, String summary, String content, String poster) {
        Post post = postRepository.insert(new Post(title, summary, content, poster));

        mongoTemplate.update(User.class)
                .matching(Criteria.where("_id").is(poster))
                .apply(new Update().push("posts").value(post))
                .first();

        return post;
    }
}
