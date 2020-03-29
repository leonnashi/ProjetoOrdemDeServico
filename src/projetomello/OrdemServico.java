/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomello;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class OrdemServico extends Cliente{
    private int numero;
    private String motivoCancelamento;
    private Date dataCadastro;
    private Date dataSolucao;
    private String descricaoProblema;
    private String descricaoServico;
    private Date dataCancelamento;
    private Cliente cliente;
    private Funcionario funcionario;
    private ClassificacaoProblema classificacao;
    
    public OrdemServico(){
        cliente = new Cliente();
        funcionario = new Funcionario();
        classificacao = new ClassificacaoProblema();
    }
    // Métodos Get e Set
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getMotivoCancelamento() {
        return motivoCancelamento;
    }
    public void setMotivoCancelamento(String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }
    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ClassificacaoProblema getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(ClassificacaoProblema classificacao) {
        this.classificacao = classificacao;
    }

    public ArrayList<OrdemServico> getOrdemServicos() {
        return ordemServicos;
    }

    public void setOrdemServicos(ArrayList<OrdemServico> ordemServicos) {
        this.ordemServicos = ordemServicos;
    }
    public Date getDataSolucao() {
        return dataSolucao;
    }
    public void setDataSolucao(Date dataSolucao) {
        this.dataSolucao = dataSolucao;
    }
    public String getDescricaoProblema() {
        return descricaoProblema;
    }
    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }
    public String getDescricaoServico() {
        return descricaoServico;
    }
    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }
    public Date getDataCancelamento() {
        return dataCancelamento;
    }
    public void setDataCancelamento(Date dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
