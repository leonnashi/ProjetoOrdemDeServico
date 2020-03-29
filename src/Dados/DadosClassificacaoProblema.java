/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import projetomello.ClassificacaoProblema;
import Interface.InterfaceClassificacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DadosClassificacaoProblema extends Dados implements InterfaceClassificacao {

    @Override
    public void cadastrar(ClassificacaoProblema classificacao) throws Exception {

        super.abrirConexao();
        String sql = " INSERT INTO classificacaoproblema (nome, descricao) ";
        sql += " VALUES (?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, classificacao.getNome());
        preparedStatement.setString(2, classificacao.getDescricao());
        //executando insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public void remover(ClassificacaoProblema classificacao) throws Exception {

        super.abrirConexao();
        String sql = "DELETE FROM classificacaoproblema ";
        sql += " WHERE CODIGO = ?";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, classificacao.getCodigo());
        // execute insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public void atualizar(ClassificacaoProblema classificacao) throws Exception {

        super.abrirConexao();
        String sql = "UPDATE ClassificacaoProblema ";
        sql += "SET descricao = ?, nome = ? ";
        sql += "WHERE codigo = ?";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, classificacao.getDescricao());
        preparedStatement.setString(2, classificacao.getNome());
        preparedStatement.setInt(3, classificacao.getCodigo());
        // execute insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public ArrayList<ClassificacaoProblema> listar(ClassificacaoProblema classificacaoProblema) throws Exception {
        //variável de retorno
        ArrayList<ClassificacaoProblema> retorno = new ArrayList<>();
        //abrindo uma conexão
        super.abrirConexao();
        String sql = " SELECT codigo, descricao, nome ";
        sql += " FROM classificacaoproblema";
        sql += " WHERE codigo > 0 ";

        if (classificacaoProblema.getCodigo() != 0) {
            sql += " and codigo = ?";
        }
        if (classificacaoProblema.getNome() != null && classificacaoProblema.getNome().equals("") == false) {
            sql += " and nome Like ?";
        }
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        int posicao = 1;
        
        if (classificacaoProblema.getNome() != null && classificacaoProblema.getNome().equals("") == false) 
        {
            preparedStatement.setString(posicao, "%"+classificacaoProblema.getNome()+"%");
            posicao++;
        }   
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            ClassificacaoProblema classificacao = new ClassificacaoProblema();
            classificacao.setCodigo(rs.getInt("codigo"));
            classificacao.setNome(rs.getString("nome"));
            classificacao.setDescricao(rs.getString("descricao"));
            retorno.add(classificacao);
        }
        super.fecharConexao();
        return retorno;
    }

}
