/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Interface.InterfaceFuncionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import projetomello.Cliente;
import projetomello.Funcionario;

/**
 *
 * @author aluno
 */
public class DadosFuncionario extends Dados implements InterfaceFuncionario {

    @Override
    public void cadastrar(Funcionario funcionario) throws Exception {

        super.abrirConexao();
        String sql = " INSERT INTO funcionario (cpf, rg, nome, salario) ";
        sql += " VALUES (?,?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, funcionario.getCpf());
        preparedStatement.setString(2, funcionario.getRg());
        preparedStatement.setString(3, funcionario.getNome());
        preparedStatement.setDouble(4, funcionario.getSalario());
        //executando insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public void remover(Funcionario funcionario) throws Exception {

        super.abrirConexao();
        String sql = "DELETE FROM funcionario WHERE matricula = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, funcionario.getMatricula());
        // execute insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public void atualizar(Funcionario funcionario) throws Exception {

        super.abrirConexao();
        String sql = "UPDATE funcionario SET nome = ?, cpf = ?, rg = ?, salario = ? WHERE matricula = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, funcionario.getNome());
        preparedStatement.setString(2, funcionario.getCpf());
        preparedStatement.setString(3, funcionario.getRg());
        preparedStatement.setDouble(4, funcionario.getSalario());
        preparedStatement.setInt(5, funcionario.getMatricula());
        // execute insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public ArrayList<Funcionario> listar(Funcionario listarFuncionario) throws Exception {
        //variável de retorno
        ArrayList<Funcionario> retorno = new ArrayList<>();

        super.abrirConexao();
        String sql = " SELECT matricula, cpf, rg, nome, salario ";
        sql += " FROM funcionario ";
        sql += " WHERE matricula > 0 ";

        if (listarFuncionario.getMatricula() != 0) {
            sql += " and matricula = ?";
        }
        if (listarFuncionario.getCpf() != null && listarFuncionario.getCpf().equals("") == false) {
            sql += " and cpf Like ?";
        }
        if (listarFuncionario.getRg() != null && listarFuncionario.getRg().equals("") == false) {
            sql += " and rg Like ?";
        }
        if (listarFuncionario.getNome() != null && listarFuncionario.getNome().equals("") == false) {
            sql += " and nome Like ?";
        }
        if (listarFuncionario.getSalario() != 0) {
            sql += " and salario = ?";
        }

        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);

        int posicao = 1;

        if (listarFuncionario.getMatricula() != 0) {
            preparedStatement.setString(posicao, "%" + listarFuncionario.getMatricula() + "%");
            posicao++;
        }
        if (listarFuncionario.getCpf() != null && listarFuncionario.getCpf().equals("") == false) {
            preparedStatement.setString(posicao, "%" + listarFuncionario.getCpf() + "%");
            posicao++;
        }
        if (listarFuncionario.getRg() != null && listarFuncionario.getRg().equals("") == false) {
            preparedStatement.setString(posicao, "%" + listarFuncionario.getRg() + "%");
            posicao++;
        }
        if (listarFuncionario.getNome() != null && listarFuncionario.getNome().equals("") == false) {
            preparedStatement.setString(posicao, "%" + listarFuncionario.getNome() + "%");
            posicao++;
        }
        if (listarFuncionario.getSalario() != 0) {
            preparedStatement.setDouble(posicao, listarFuncionario.getSalario());
            posicao++;
        }
        ResultSet rs = preparedStatement.executeQuery();
        // os resultados serao Matricula, Nome e Salario
        while (rs.next()) {
            Funcionario funcionario = new Funcionario();
            funcionario.setMatricula(rs.getInt("matricula"));
            funcionario.setCpf(rs.getString("cpf"));
            funcionario.setRg(rs.getString("rg"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setSalario(rs.getDouble("salario"));
            retorno.add(funcionario);
        }
        super.fecharConexao();
        return retorno;
    }

}
