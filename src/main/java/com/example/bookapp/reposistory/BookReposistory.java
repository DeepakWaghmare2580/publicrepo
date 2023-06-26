package com.example.bookapp.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookapp.model.book;

public interface BookReposistory extends JpaRepository<book, Integer> {

}
