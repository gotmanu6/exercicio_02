package services;

import models.ProdutoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoService produtoRepository;

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produtoModel) {
        return produtoRepository.criarProduto(produtoModel);
    }

    public Optional<ProdutoModel> findById(Long id) {
        return produtoRepository.findById(id);
    }

    public ProdutoModel atualizar(Long id, ProdutoModel produtoModel) {
        ProdutoModel model = produtoRepository.findById(id).get();
        model.setNome(produtoModel.getNome());
        model.setPrecoProduto(produtoModel.getPrecoProduto());
        model.setEstoque(produtoModel.getEstoque());
        return produtoRepository.atualizar(id, model);
    }

    public ResponseEntity<?> deletar(Long id) {
        produtoRepository.deletar(id);
        return null;
    }
}