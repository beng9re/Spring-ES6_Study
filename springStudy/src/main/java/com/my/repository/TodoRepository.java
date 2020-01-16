package com.my.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
