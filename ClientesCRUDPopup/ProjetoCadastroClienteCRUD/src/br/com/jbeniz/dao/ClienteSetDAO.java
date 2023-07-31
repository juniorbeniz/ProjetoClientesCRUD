package br.com.jbeniz.dao;

import br.com.jbeniz.domain.Cliente;

import java.util.Collection;

public class ClienteSetDAO implements IClienteDAO{

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente excluir(Long cpf) {

        return null;
    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Cliente consultar(Long cpf) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
