package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vo.Post;

public interface Postdao extends JpaRepository<Post, Integer> {

}
