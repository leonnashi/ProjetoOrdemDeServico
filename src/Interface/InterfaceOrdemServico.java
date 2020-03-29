/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.util.ArrayList;
import projetomello.OrdemServico;

public interface InterfaceOrdemServico {
    
    void cadastrar(OrdemServico ordemServico) throws Exception;
    void remover(OrdemServico ordemServico) throws Exception;
    void atualizar(OrdemServico ordemServico) throws Exception;
    void cancelarOrdemServico (OrdemServico ordemServico) throws Exception;
    void solucionarOrdemServico (OrdemServico ordemServico) throws Exception;
    ArrayList<OrdemServico> listar(OrdemServico ordemServico) throws Exception; 
    ArrayList <OrdemServico> listarOrdemServicoAberta (OrdemServico ordemServico) throws Exception;
}
