/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dados.DadosClassificacaoProblema;
import java.util.ArrayList;
import projetomello.ClassificacaoProblema;

/**
 *
 * @author aluno
 */
public class NegocioClassificacao implements Interface.InterfaceClassificacao {

    @Override
    public void cadastrar(ClassificacaoProblema classificacao) throws Exception {
        if (classificacao.getNome() == null) {
            throw new Exception("Informar o nome ");
        }
        if (classificacao.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome ");
        }
        if (classificacao.getNome().length() > 100) {
            throw new Exception("O nome deverá ter no máximo 100 caracteres");
        }
        if (classificacao.getDescricao().trim().equals("") == true) {
            throw new Exception("Voce deve informar a descrição do problema");
        }

        DadosClassificacaoProblema dadosClass = new DadosClassificacaoProblema();
        dadosClass.cadastrar(classificacao);
    }

    @Override
    public void remover(ClassificacaoProblema classificacao) throws Exception {
        if (classificacao.getCodigo() <= 0) {
            throw new Exception("O Codigo ser superior a zero");
        }
        if (classificacao.getNome() == null) {
            throw new Exception("Informar o nome ");
        }
        if (classificacao.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome ");
        }
        if (classificacao.getNome().length() > 100) {
            throw new Exception("O nome deverá ter no máximo 100 caracteres");
        }
        if (classificacao.getDescricao().trim().equals("") == true) {
            throw new Exception("Voce deve informar a descrição do problema");
        }
        DadosClassificacaoProblema dadosClass = new DadosClassificacaoProblema();
        dadosClass.remover(classificacao);
    }

    @Override
    public void atualizar(ClassificacaoProblema classificacao) throws Exception {
        if (classificacao.getNome() == null) {
            throw new Exception("Informar o nome ");
        }
        if (classificacao.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome ");
        }
        if (classificacao.getNome().length() > 100) {
            throw new Exception("O nome deverá ter no máximo 100 caracteres");
        }
        if (classificacao.getDescricao().trim().equals("") == true) {
            throw new Exception("Voce deve informar a descrição do problema");
        }

        DadosClassificacaoProblema dadosClassificacao = new DadosClassificacaoProblema();
        dadosClassificacao.atualizar(classificacao);
    }

    @Override
    public ArrayList<ClassificacaoProblema> listar(ClassificacaoProblema classificacaoProblema) throws Exception {
        DadosClassificacaoProblema dadosClassificacao = new DadosClassificacaoProblema();
        return dadosClassificacao.listar(classificacaoProblema);
    }

}
