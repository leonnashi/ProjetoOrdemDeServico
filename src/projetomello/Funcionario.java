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
public class Funcionario extends Pessoa{
   private int matricula;
   private double salario;
   private Pessoa pessoa;

    // ArrayList por ser (0,N)
   ArrayList<OrdemServico> ordemServicos;
   public Funcionario(){
   ordemServicos = new ArrayList<>();
   }
    // Métodos Get e Set
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
