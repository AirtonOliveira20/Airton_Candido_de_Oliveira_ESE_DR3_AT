package com.exemplo.fornecedoresservice.config;

import com.exemplo.fornecedoresservice.model.Fornecedor;
import com.exemplo.fornecedoresservice.repository.FornecedorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Popula o banco H2 em memoria com cinco fornecedores de teste assim que a aplicacao sobe.
 */
@Component
public class DataInitializer implements CommandLineRunner {

    private final FornecedorRepository fornecedorRepository;

    public DataInitializer(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @Override
    public void run(String... args) {
        fornecedorRepository.save(new Fornecedor("Alfa Materiais Ltda", "11222333000181"));
        fornecedorRepository.save(new Fornecedor("Beta Distribuidora S.A.", "22333444000172"));
        fornecedorRepository.save(new Fornecedor("Gama Tecnologia ME", "33444555000163"));
        fornecedorRepository.save(new Fornecedor("Delta Embalagens Ltda", "44555666000154"));
        fornecedorRepository.save(new Fornecedor("Omega Logistica EIRELI", "55666777000145"));
    }
}
