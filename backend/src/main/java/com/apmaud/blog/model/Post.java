package com.apmaud.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Post {
    @Id
    private ObjectId id;
    private String title;
    private String summary;
    private String content;
    private String poster;

    public Post(String title, String summary, String content, String poster) {
        this.title = title;
        this.summary = summary;
        this.content = content;
        this.poster = poster;
    }
}
