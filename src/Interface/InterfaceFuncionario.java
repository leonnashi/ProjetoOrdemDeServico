/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.util.ArrayList;
import projetomello.Funcionario;

public interface InterfaceFuncionario {
    
    void cadastrar(Funcionario funcionario) throws Exception;
    void remover(Funcionario funcionario) throws Exception;
    void atualizar(Funcionario funcionario) throws Exception;
    ArrayList<Funcionario> listar(Funcionario listarFuncionario) throws Exception;
    
}
