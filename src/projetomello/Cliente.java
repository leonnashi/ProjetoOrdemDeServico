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
public class Cliente extends Pessoa{
    ArrayList<OrdemServico> ordemServicos;
    
    // Array List por ser (0,N)
    public Cliente(){
        ordemServicos = new ArrayList<>();       
    }
    
    
}
