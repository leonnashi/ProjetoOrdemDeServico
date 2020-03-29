/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dados.DadosOrdemServico;
import java.util.ArrayList;
import projetomello.OrdemServico;

/**
 *
 * @author aluno
 */
public class NegocioOrdemServico implements Interface.InterfaceOrdemServico {

    @Override
    public void cadastrar(OrdemServico ordemServico) throws Exception {
        if (ordemServico.getDescricaoProblema() == null || ordemServico.getDescricaoProblema().trim().equals("")) {
            throw new Exception("Descreva a descrição do problema");
        }
        if (ordemServico.getCliente().getCpf() == null || ordemServico.getCliente().getCpf().equals("")) {
            throw new Exception("Selecione o cliente");
        }
        if (ordemServico.getFuncionario().getMatricula() <= 0) {
            throw new Exception("Selecione o funcionário");
        }
        if (String.valueOf(ordemServico.getClassificacao().getCodigo()).equals("")) {
            throw new Exception("Selecione o problema");
        }
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        dadosOrdem.cadastrar(ordemServico);
    }

    @Override
    public void remover(OrdemServico ordemServico) throws Exception {
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        dadosOrdem.remover(ordemServico);
    }

    @Override
    public void atualizar(OrdemServico ordemServico) throws Exception {
        if (String.valueOf(ordemServico.getFuncionario().getMatricula()).equals("")) {
            throw new Exception("Selecione a Ordem de Serviço");
        }
        if (ordemServico.getDescricaoProblema() == null || ordemServico.getDescricaoProblema().equals("")) {
            throw new Exception("Selecione a Ordem de Serviço");
        }
        if (ordemServico.getCliente().getCpf() == null || ordemServico.getCliente().getCpf().equals("")) {
            throw new Exception("Selecione a Ordem de Serviço");
        }
        if (String.valueOf(ordemServico.getClassificacao().getCodigo()).equals("")) {
            throw new Exception("Codigo de Classificação vazio!");
        }
        if (ordemServico.getNumero() <= 0) {
            throw new Exception("Numero da ordem não pode ser igual ou menor que 0!");
        }
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        dadosOrdem.atualizar(ordemServico);
    }

    @Override
    public void cancelarOrdemServico(OrdemServico ordemServico) throws Exception {
        {
            if (ordemServico.getNumero() <= 0) {
                throw new Exception("Numero da ordem não pode ser igual ou menor que 0!");
            }
            if (ordemServico.getMotivoCancelamento().equals("") || ordemServico.getMotivoCancelamento() == null) {
                throw new Exception("O motivo de cancelamento não deve estar vazio!");
            }

            DadosOrdemServico dadosOrdem = new DadosOrdemServico();
            dadosOrdem.cancelarOrdemServico(ordemServico);
        }
    }

    @Override
    public void solucionarOrdemServico(OrdemServico ordemServico) throws Exception {
        if (ordemServico.getNumero() <= 0) {
            throw new Exception("Numero da ordem não pode ser igual ou menor que 0!");
        }
        if (ordemServico.getDescricaoServico().equals("") || ordemServico.getDescricaoServico() == null) {
            throw new Exception("A descriçào não deve estar vazia!");
        }

        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        dadosOrdem.solucionarOrdemServico(ordemServico);
    }

    @Override
    public ArrayList<OrdemServico> listar(OrdemServico ordemServico) throws Exception {
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        return dadosOrdem.listar(ordemServico);
    }

    @Override
    public ArrayList<OrdemServico> listarOrdemServicoAberta(OrdemServico ordemServico) throws Exception {
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        return dadosOrdem.listarOrdemServicoAberta(ordemServico);
    }
}
