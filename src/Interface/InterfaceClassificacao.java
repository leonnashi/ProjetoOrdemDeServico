/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.util.ArrayList;
import projetomello.ClassificacaoProblema;

public interface InterfaceClassificacao {
    
    void cadastrar(ClassificacaoProblema classificacao) throws Exception;
    void remover(ClassificacaoProblema classificacao) throws Exception;
    void atualizar(ClassificacaoProblema classificacao) throws Exception;
    ArrayList<ClassificacaoProblema> listar(ClassificacaoProblema classificacaoProblema) throws Exception;

}
