/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomello;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ClassificacaoProblema {
    private int codigo;
    private String descricao;
    private String nome;

    // Array List por ser (0,N)
    ArrayList<OrdemServico> ordemServicos;
    public ClassificacaoProblema(){
    ordemServicos = new ArrayList<>();
    }

    // Métodos Get e Set
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
