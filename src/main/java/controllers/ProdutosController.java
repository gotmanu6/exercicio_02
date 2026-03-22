package com.example.demo.controllers;


import com.example.demo.models.LivroModel;
import com.example.demo.services.LivrosService;
import models.ProdutoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/livros")

public class ProdutoController {
    @Autowired
    private ProdutoService ProdutoService;

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> findAll() {
        List<ProdutoModel> requeste = ProdutoService.findAll();
        return ResponseEntity.ok().body(requeste);
    }

    @PostMapping
    public ResponseEntity<ProdutoModel> criarPessoa(@RequestBody ProdutoModel produtoModel) {
        ProdutoModel requeste = ProdutoService.criarProduto(ProdutoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}").buildAndExpand(ProdutoModel.getId())
                .toUri();
        return ResponseEntity.created(uri).body(requeste);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        return ProdutoService.deletar(id);
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel> buscarId(@PathVariable Long id) {
        return ProdutoService.findById(id);
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizar(@PathVariable Long id, @RequestBody ProdutoModel produtoModel) {
        return ProdutoService.atualizar(id, produtoModel);
    }

}
