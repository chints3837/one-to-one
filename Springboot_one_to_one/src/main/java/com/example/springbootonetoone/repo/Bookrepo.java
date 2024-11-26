package com.example.springbootonetoone.repo;

import com.example.springbootonetoone.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookrepo extends JpaRepository<Book,Integer> {
}
