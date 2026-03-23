package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<models.ProdutoModel, Long> {

}
