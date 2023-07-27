package ru.netology.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.repository.PostRepository;
import ru.netology.service.PostService;

@Configuration
public class DiConfiguration {

    @Bean
    public PostController postController(PostService service) {
        return new PostController(service);
    }

    @Bean
    public PostService postService(PostRepository repository) {
        return new PostService(repository);
    }

    @Bean
    public PostRepository postRepository() {
        return new PostRepository();
    }
}