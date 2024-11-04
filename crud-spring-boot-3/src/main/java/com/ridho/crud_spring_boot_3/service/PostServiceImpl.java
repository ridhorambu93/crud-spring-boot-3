/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ridho.crud_spring_boot_3.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ridho.crud_spring_boot_3.model.Post;
import com.ridho.crud_spring_boot_3.repository.PostRepository;

import lombok.AllArgsConstructor;

/**
 *
 * @author LENOVO
 */

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post createPost(Post post) {
        post.setCreatedDate(new Date());
        return postRepository.save(post);
    }

    // saat data id yg dicari kosong maka return error namun jika ada maka akan eksekusi var existingPost
    @Override
    public Post updatePost(Post post) {
        Post existingPost = postRepository.findById(post.getId()).get();
        existingPost.setText(post.getText());
        existingPost.setModifiedDate(new Date());
        return postRepository.save(existingPost);
    }

    @Override
    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }

}
