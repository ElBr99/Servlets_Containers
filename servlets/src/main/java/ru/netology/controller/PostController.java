package ru.netology.controller;

import ru.netology.model.Post;
import ru.netology.service.PostService;

public class PostController extends GenericController<Post> {
    public PostController(PostService postService) {
        super(postService);
    }
}
