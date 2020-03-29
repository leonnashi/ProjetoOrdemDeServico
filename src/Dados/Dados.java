/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dados {

    public Connection coon;
    //Constantes de valores para os drivers de conexão
    private String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
    private String LOCAL_SERVIDOR = "localhost";
    private String BANCO_DE_DADOS = "ordemservico";
    private String PORTA_BANCO = "3306";
    private String USUARIO = "root";
    private String SENHA = "";

    //Comandos para entrada de conexão
    public void abrirConexao() throws Exception {
        //Vinculando o driver que será utilizado
        Class.forName(DRIVER_MYSQL).newInstance();
        //Construção da URL de conexão
        String url = "jdbc:mysql://" + LOCAL_SERVIDOR + ":" + PORTA_BANCO + "/" + BANCO_DE_DADOS;
        //estabelecendo a conexão
        coon = (Connection) DriverManager.getConnection(url, USUARIO, SENHA);
    }
    public void fecharConexao() throws Exception{
        //fechando a conexão com o banco de dados
        coon.close();
    }
}
