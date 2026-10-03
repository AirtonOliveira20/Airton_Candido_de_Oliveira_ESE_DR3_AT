package com.exemplo.fornecedoresservice.client;

import com.exemplo.fornecedoresservice.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// name = nome do servico registrado no Eureka. O Feign pergunta ao Eureka
// onde o produtos-service esta e faz a chamada HTTP sozinho.
@FeignClient(name = "produtos-service")
public interface ProdutoClient {

    // Mesmo caminho do ProdutoController do produtos-service: GET /produtos
    @GetMapping("/produtos")
    List<ProdutoDTO> listarTodos();
}
