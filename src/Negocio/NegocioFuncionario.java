/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dados.DadosCliente;
import Dados.DadosFuncionario;
import Interface.InterfaceFuncionario;
import java.util.ArrayList;
import projetomello.Funcionario;

/**
 *
 * @author Leon
 */
public class NegocioFuncionario implements InterfaceFuncionario {

    @Override
    public void cadastrar(Funcionario funcionario) throws Exception {
        if (funcionario == null) {
            throw new Exception("Informar os dados do cliente");
        }
        if (funcionario.getCpf().trim().length() != 14) {
            throw new Exception("O CPF deverá ser informado");
        }
        if (funcionario.getRg().trim().length() != 10) {
            throw new Exception("O RG deverá ser informado");
        }
        if (funcionario.getNome() == null) {
            throw new Exception("Informar o nome do funcionario");
        }
        if (funcionario.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome do funcionario");
        }
        if (funcionario.getNome().length() > 100) {
            throw new Exception("O nome deverá ter no máximo 100 caracteres");
        }
        if (funcionario.getSalario() <= 0) {
            throw new Exception("O salãrio deverá ser superior a zero");
        }
        //enviar o objeto para os dados
        DadosFuncionario dadosFuncionario = new DadosFuncionario();
        dadosFuncionario.cadastrar(funcionario);
    }

    @Override
    public void remover(Funcionario funcionario) throws Exception {
        //validar o objeto e seus dados
        if (funcionario.getMatricula() <= 0) {
            throw new Exception("A matricula do funcionário deverá ser informado");
        }
        if (funcionario.getCpf().trim().length() != 14) {
            throw new Exception("O CPF deve conter 14 digitos!");
        }
        if (funcionario.getNome().trim().length() == 0) {
            throw new Exception("Voce não digitou nenhum nome");
        }
        if (funcionario.getRg().trim().length() != 10) {
            throw new Exception("O RG deverá conter 10 digitos");
        }
        if (funcionario.getSalario() >= 0) {
            throw new Exception("O salário do funcionário deverá ser informado");
        }
        //enviar o objeto para os dados
        DadosFuncionario dadosFuncionario = new DadosFuncionario();
        dadosFuncionario.remover(funcionario);
    }

    @Override
    public void atualizar(Funcionario funcionario) throws Exception {
        if (funcionario.getMatricula() <= 0) {
            throw new Exception("A matricula do funcionário deverá ser informado");
        }
        if (funcionario.getCpf().trim().length() != 14) {
            throw new Exception("O CPF deve conter 14 digitos!");
        }
        if (funcionario.getNome().trim().length() == 0) {
            throw new Exception("Voce não digitou nenhum nome");
        }
        if (funcionario.getRg().trim().length() != 10) {
            throw new Exception("O RG deverá conter 10 digitos");
        }
        DadosFuncionario dadosFuncionario = new DadosFuncionario();
        dadosFuncionario.atualizar(funcionario);
    }

    @Override
    public ArrayList<Funcionario> listar(Funcionario listarFuncionario) throws Exception {
        DadosFuncionario dadosFuncionario = new DadosFuncionario();
        return dadosFuncionario.listar(listarFuncionario);
    }
}
