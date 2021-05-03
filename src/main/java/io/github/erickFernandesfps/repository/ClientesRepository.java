package io.github.erickFernandesfps.repository;

import io.github.erickFernandesfps.model.Cliente;
import org.springframework.stereotype.Repository;

/**
 * ESSA CLASSE VAI ACESSAR A BASE DE DADOS, TABELA DE CLIENTE,
 * OU SEJA, ELE VAI SALVAR, ATUALIZAR, DELETAR
 */
@Repository
public class ClientesRepository {

    public void persistir(Cliente cliente) {
        // acessa a base e salvar cliente
    }
}
