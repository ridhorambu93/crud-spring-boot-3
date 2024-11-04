/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ridho.crud_spring_boot_3.service;
import java.util.List;

import com.ridho.crud_spring_boot_3.model.Post;

/**
 *
 * @author LENOVO
 */
public interface  PostService {
    List<Post> findAll();

    Post createPost(Post post);

    Post updatePost(Post post);
    
    void deletePostById(Long id);
}
