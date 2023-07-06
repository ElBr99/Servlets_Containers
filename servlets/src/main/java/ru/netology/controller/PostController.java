package ru.netology.controller;

import ru.netology.model.Post;
import ru.netology.repository.PostRepository;
import ru.netology.service.PostService;

public class PostController extends GenericController<Post> {
    public PostController() {
        super(new PostService(new PostRepository()));
    }
}
