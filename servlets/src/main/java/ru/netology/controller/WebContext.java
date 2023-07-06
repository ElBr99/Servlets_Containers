package ru.netology.controller;

import ru.netology.model.Post;

import java.util.Map;


public final class WebContext {

    public static final Map<Class<?>, GenericController<?>> CONTROLLER_MAP = Map.of(
            Post.class, new PostController()
    );

    public static final String API_POSTS = "/api/posts";
    public static final String API_POSTS_ID = "/api/posts/\\d+";
    public static final String STR = "/";
    public static final String GET_METHOD = "GET";
    public static final String POST_METHOD = "POST";
    public static final String DELETE_METHOD = "DELETE";

}
