package com.blog.services;

import java.util.List;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, int userId, int categoryId);

	// update
	PostDto updatePost(PostDto postDto, int postId);

	// delete
	void deletePost(int postId);

	// get all post
	List<PostDto> getAllPost();

	// get single post
	PostDto getPostById(int postId);

	// get all post by category
	List<PostDto> getPostsByCategory(int categoryId);

	// get all post by user
	List<PostDto> getPostsByUser(int userId);

	// search posts
	List<PostDto> searchPosts(String keyword);

}