package io.github.erickFernandesfps.service;

import io.github.erickFernandesfps.model.Cliente;
import io.github.erickFernandesfps.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ESSA CLASSE VAI ACESSASR A CLASSE REPOSITORIO
 */
@Service
public class ClientesServices {

    private ClientesRepository repository;

    @Autowired// vai injetar
    public ClientesServices(ClientesRepository repository) {
        this.repository = repository;
    }
    //INJEÇÃO DE DEPENDENCIAs
    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {
        //aplica validaçoes
    }

}

