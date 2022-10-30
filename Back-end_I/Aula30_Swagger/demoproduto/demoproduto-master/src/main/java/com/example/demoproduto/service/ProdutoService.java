package com.example.demoproduto.service;

import com.example.demoproduto.model.ProdutoModel;
import com.example.demoproduto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoModel salvar(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> salvarTodos(){
        return produtoRepository.findAll();
    }

    public ProdutoModel buscarPorId(Integer id){
        return produtoRepository.findById(id).get();
    }

    public void delete(Integer id){
        produtoRepository.deleteById(id);
    }


}
