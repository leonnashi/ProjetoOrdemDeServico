/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Interface.InterfaceCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import projetomello.Cliente;

/**
 *
 * @author aluno
 */
public class DadosCliente extends Dados implements InterfaceCliente {

    @Override
    public void cadastrar(Cliente cliente) throws Exception {

        super.abrirConexao();
        String sql = " INSERT INTO cliente (cpf, rg, nome) ";
        sql += " VALUES (?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, cliente.getCpf());
        preparedStatement.setString(2, cliente.getRg());
        preparedStatement.setString(3, cliente.getNome());
        //executando insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public void remover(Cliente cliente) throws Exception {

        super.abrirConexao();
        String sql = "DELETE FROM cliente WHERE cpf = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, cliente.getCpf());
        // execute insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public void atualizar(Cliente clienteNovo, Cliente clienteVelho) throws Exception {

        super.abrirConexao();
        String sql = "UPDATE cliente SET nome = ?, cpf = ?,  rg = ? WHERE cpf = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, clienteNovo.getNome());
        preparedStatement.setString(2, clienteNovo.getCpf());
        preparedStatement.setString(3, clienteNovo.getRg());
        preparedStatement.setString(4, clienteVelho.getCpf());
        // execute insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public ArrayList<Cliente> listar(Cliente listarCliente) throws Exception {

        ArrayList<Cliente> retorno = new ArrayList<>();

        super.abrirConexao();
        String sql = " SELECT cpf, rg, nome ";
        sql += " FROM cliente ";
        sql += " WHERE 0 = 0 ";

        if (listarCliente.getCpf() != null && listarCliente.getCpf().equals("") == false) {
            sql += " and cpf Like ?";
        }
        if (listarCliente.getRg() != null && listarCliente.getRg().equals("") == false) {
            sql += " and rg Like ?";
        }
        if (listarCliente.getNome() != null && listarCliente.getNome().equals("") == false) {
            sql += " and nome Like ?";
        }
        
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        
        int posicao = 1;

        if (listarCliente.getCpf() != null && listarCliente.getCpf().equals("") == false) {
            preparedStatement.setString(posicao, "%" + listarCliente.getCpf() + "%");
            posicao++;
        }
        if (listarCliente.getRg() != null && listarCliente.getRg().equals("") == false) {
            preparedStatement.setString(posicao, "%" + listarCliente.getRg() + "%");
            posicao++;
        }
        if (listarCliente.getNome() != null && listarCliente.getNome().equals("") == false) {
            preparedStatement.setString(posicao, "%" + listarCliente.getNome() + "%");
            posicao++;
        }

        ResultSet rs = preparedStatement.executeQuery();
        
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setCpf(rs.getString("cpf"));
            cliente.setNome(rs.getString("nome"));
            cliente.setRg(rs.getString("rg"));
            retorno.add(cliente);
        }
        super.fecharConexao();
        return retorno;
    }

}
