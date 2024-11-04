/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ridho.crud_spring_boot_3.repository;
import  org.springframework.data.jpa.repository.JpaRepository;

import com.ridho.crud_spring_boot_3.model.Post;

/**
 *
 * @author LENOVO
 */
public interface PostRepository extends  JpaRepository<Post, Long> {

}
