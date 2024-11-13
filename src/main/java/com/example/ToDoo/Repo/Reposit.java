package com.example.ToDoo.Repo;

import com.example.ToDoo.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Reposit extends JpaRepository<ToDo, Long> {

}

