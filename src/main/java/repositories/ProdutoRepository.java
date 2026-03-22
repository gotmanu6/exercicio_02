package com.example.demo.repositories;

import com.example.demo.models.ProdutoModel;
import models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<models.ProdutoModel, Long> {

}
