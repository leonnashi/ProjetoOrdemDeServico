/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dados.DadosCliente;
import Interface.InterfaceCliente;
import java.util.ArrayList;
import projetomello.Cliente;

/**
 *
 * @author aluno
 */
public class NegocioCliente implements InterfaceCliente {

    @Override
    public void cadastrar(Cliente cliente) throws Exception {
        //validar o objeto e seus dados
        if (cliente == null) {
            throw new Exception("Informar os dados do cliente");
        }
        if (cliente.getCpf().trim().length() != 14) {
            throw new Exception("O CPF deverá ser informado");
        }
        if (cliente.getRg().trim().length() != 10) {
            throw new Exception("O RG deverá ser informado");
        }
        if (cliente.getNome() == null) {
            throw new Exception("Informar o nome do cliente");
        }
        if (cliente.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome do cliente");
        }
        if (cliente.getNome().length() > 100) {
            throw new Exception("O nome deverá ter no máximo 100 caracteres");
        }
        //enviar o objeto para os dados
        DadosCliente dadosCliente = new DadosCliente();
        dadosCliente.cadastrar(cliente);
    }

    @Override
    public void remover(Cliente cliente) throws Exception {
        //validar o objeto e seus dados
        if (cliente.getCpf().trim().length() != 14) {
            throw new Exception("O CPF deve conter 14 digitos!");
        }
        if (cliente.getNome().trim().length() == 0) {
            throw new Exception("Voce não digitou nenhum nome");
        }
        if (cliente.getRg().trim().length() != 10) {
            throw new Exception("O RG deverá conter 10 digitos");
        }
        //enviar o objeto para os dados
        DadosCliente dadosCliente = new DadosCliente();
        dadosCliente.remover(cliente);
    }

    @Override
    public void atualizar(Cliente clienteNovo, Cliente clienteVelho) throws Exception {
        if (clienteNovo.getCpf().trim().length() != 14) {
            throw new Exception("O CPF deve conter 14 digitos!");
        }
        if (clienteNovo.getNome().trim().length() == 0) {
            throw new Exception("Voce não digitou nenhum nome");
        }
        if (clienteNovo.getRg().trim().length() != 10) {
            throw new Exception("O RG deverá conter 10 digitos");
        }
        DadosCliente dadosCliente = new DadosCliente();
        dadosCliente.atualizar(clienteNovo, clienteVelho);
    }

    @Override
    public ArrayList<Cliente> listar(Cliente listarCliente) throws Exception {
        DadosCliente dadosCliente = new DadosCliente();
        return dadosCliente.listar(listarCliente);
    }
}
