/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import projetomello.Cliente;

public interface InterfaceCliente {

    void cadastrar(Cliente cliente) throws Exception;
    void remover(Cliente cliente) throws Exception;
    void atualizar(Cliente clienteNovo, Cliente clienteVelho) throws Exception;
    ArrayList<Cliente> listar(Cliente listarCliente) throws Exception;
}
