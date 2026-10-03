package com.exemplo.fornecedoresservice.service;

import com.exemplo.fornecedoresservice.client.ProdutoClient;
import com.exemplo.fornecedoresservice.dto.ProdutoDTO;
import com.exemplo.fornecedoresservice.model.Fornecedor;
import com.exemplo.fornecedoresservice.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository fornecedorRepository;
    private final ProdutoClient produtoClient;

    public FornecedorService(FornecedorRepository fornecedorRepository, ProdutoClient produtoClient) {
        this.fornecedorRepository = fornecedorRepository;
        this.produtoClient = produtoClient;
    }

    public List<Fornecedor> listarTodos() {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> buscarPorId(Long id) {
        return fornecedorRepository.findById(id);
    }

    public Fornecedor salvar(Fornecedor fornecedor) {
        // Ignora qualquer id vindo no JSON: quem gera o id e' o banco.
        // Sem isso, um id enviado faria o save() atualizar um registro existente.
        fornecedor.setId(null);
        return fornecedorRepository.save(fornecedor);
    }

    // Busca a lista de produtos no produtos-service via Feign.
    public List<ProdutoDTO> listarProdutos() {
        return produtoClient.listarTodos();
    }
}
