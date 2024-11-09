package com.projetospring.desafio.service;

import com.projetospring.desafio.model.Cliente;

/**
 * Interface para definir o padrao que devemos seguir.
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
