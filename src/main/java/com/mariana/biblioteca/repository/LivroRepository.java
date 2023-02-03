package com.mariana.biblioteca.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariana.biblioteca.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{
    
}