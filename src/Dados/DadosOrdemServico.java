/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Interface.InterfaceOrdemServico;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import projetomello.OrdemServico;

public class DadosOrdemServico extends Dados implements InterfaceOrdemServico {

    @Override
    public void cadastrar(OrdemServico ordemServico) throws Exception {

        super.abrirConexao();
        String sql = " INSERT INTO ordemservico (descricaoproblema, datacadastro ,matricula_funcionario, cpf_cliente, codigo_classificacao) ";
        sql += " VALUES (?,?,?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, ordemServico.getDescricaoProblema());
        preparedStatement.setDate(2, ordemServico.getDataCadastro());
        preparedStatement.setInt(3, ordemServico.getFuncionario().getMatricula());
        preparedStatement.setString(4, ordemServico.getCliente().getCpf());
        preparedStatement.setInt(5, ordemServico.getClassificacao().getCodigo());
        //executando insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public void remover(OrdemServico ordemServico) throws Exception {

        super.abrirConexao();
        String sql = "DELETE FROM ordemservico WHERE numero = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, ordemServico.getNumero());
        // execute insert SQL
        preparedStatement.executeUpdate();
        super.fecharConexao();
    }

    @Override
    public void atualizar(OrdemServico ordemServico) throws Exception {

        super.abrirConexao();

        String sql = "Update ordemservico Set datacadastro = ?, descricaoproblema = ?, cpf_cliente = ?, codigo_classificacao = ?, matricula_funcionario = ? Where numero = ?";

        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);
        preparedStatement.setDate(1, ordemServico.getDataCadastro());
        preparedStatement.setString(2, ordemServico.getDescricaoProblema());
        preparedStatement.setString(3, ordemServico.getCliente().getCpf());
        preparedStatement.setInt(4, ordemServico.getClassificacao().getCodigo());
        preparedStatement.setInt(5, ordemServico.getFuncionario().getMatricula());
        preparedStatement.setInt(6, ordemServico.getNumero());

        preparedStatement.executeUpdate();

        super.fecharConexao();
    }

    @Override
    public ArrayList<OrdemServico> listar(OrdemServico ordemServico) throws Exception {
        abrirConexao();

        ArrayList<OrdemServico> retorno = new ArrayList<>();

        String sql = "Select Os.numero as numeroOrdem, Os.motivocancelamento as motivoCancelamentoOrdem, Os.datacadastro as dataCadastroOrdem, Os.datasolucao as dataSolucaoOrdem, \n"
                + "Os.descricaoproblema as descProblemaOrdem, Os.descricaoservico as descServicoOrdem, Os.datacancelamento as dataCancelamentoOrdem, \n"
                + "\n"
                + "Fun.matricula As matriculafuncionario, Fun.salario as salariofuncionario, Fun.nome as nomefuncionario, Fun.rg as rgfuncionario, Fun.cpf as cpffuncionario, \n"
                + "\n"
                + "Cli.cpf as cpfcliente, Cli.nome as nomecliente, Cli.rg as rgcliente, \n"
                + "\n"
                + "ClassP.codigo as codigoclassProblema, ClassP.nome as nomeClassProblema, ClassP.descricao as descricaoClassProblema\n"
                + "\n"
                + "\n"
                + "FROM ordemservico As Os \n"
                + "Join cliente As Cli On Os.cpf_cliente = Cli.cpf \n"
                + "Join funcionario As Fun on Os.matricula_funcionario = Fun.matricula \n"
                + "Join classificacaoproblema As ClassP On Os.codigo_classificacao = ClassP.codigo \n"
                + "WHERE numero > 0";

        if (ordemServico.getCliente().getCpf() != null && ordemServico.getCliente().getCpf().trim().equals("") == false) {
            sql += " and Cli.cpf LIKE  ? ";
        }
        if (ordemServico.getCliente().getRg() != null && ordemServico.getCliente().getRg().trim().equals("") == false) {
            sql += " and Cli.rg LIKE  ? ";
        }
        if (ordemServico.getCliente().getNome() != null && ordemServico.getCliente().getNome().trim().equals("") == false) {
            sql += " and Cli.nome LIKE  ? ";
        }
        if (ordemServico.getFuncionario().getCpf() != null && ordemServico.getFuncionario().getCpf().trim().equals("") == false) {
            sql += " and Fun.cpf LIKE  ? ";
        }
        if (ordemServico.getFuncionario().getNome() != null && ordemServico.getFuncionario().getNome().trim().equals("") == false) {
            sql += " and Fun.nome LIKE  ? ";
        }
        if (ordemServico.getFuncionario().getRg() != null && ordemServico.getFuncionario().getRg().trim().equals("") == false) {
            sql += " and Fun.rg LIKE  ? ";
        }
        if (ordemServico.getFuncionario().getSalario() != 0) {
            sql += " and Fun.salario = ? ";
        }
        if (ordemServico.getFuncionario().getMatricula() != 0) {
            sql += " and Fun.matricula = ? ";
        }
        //preparando a instrução
        PreparedStatement preparedStatement = super.coon.prepareStatement(sql);

        int pos = 1;

        if (ordemServico.getCliente().getCpf() != null && ordemServico.getCliente().getCpf().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getCliente().getCpf() + "%");
            pos++;
        }
        if (ordemServico.getCliente().getRg() != null && ordemServico.getCliente().getRg().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getCliente().getRg() + "%");
            pos++;
        }
        if (ordemServico.getCliente().getNome() != null && ordemServico.getCliente().getNome().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getCliente().getNome() + "%");
            pos++;
        }
        if (ordemServico.getFuncionario().getCpf() != null && ordemServico.getFuncionario().getCpf().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getFuncionario().getCpf() + "%");
            pos++;
        }
        if (ordemServico.getFuncionario().getNome() != null && ordemServico.getFuncionario().getNome().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getFuncionario().getNome() + "%");
            pos++;
        }
        if (ordemServico.getFuncionario().getRg() != null && ordemServico.getFuncionario().getRg().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getFuncionario().getRg() + "%");
            pos++;
        }
        if (ordemServico.getFuncionario().getSalario() != 0) {
            preparedStatement.setDouble(pos, ordemServico.getFuncionario().getSalario());
            pos++;
        }
        if (ordemServico.getFuncionario().getMatricula() != 0) {
            preparedStatement.setInt(pos, ordemServico.getFuncionario().getMatricula());
            pos++;
        }
        // execute insert SQL stetement
        ResultSet rs = preparedStatement.executeQuery();
        // os resultados serao Matricula, Nome e Salario
        while (rs.next()) {
            OrdemServico os = new OrdemServico();
            os.setNumero(rs.getInt("numeroOrdem"));
            os.setMotivoCancelamento(rs.getString("motivoCancelamentoOrdem"));
            os.setDataCadastro(rs.getDate("dataCadastroOrdem"));
            os.setDataSolucao(rs.getDate("dataSolucaoOrdem"));
            os.setDescricaoProblema(rs.getString("descProblemaOrdem"));
            os.setDescricaoServico(rs.getString("descServicoOrdem"));
            os.setDataCancelamento(rs.getDate("dataCancelamentoOrdem"));
            os.getFuncionario().setMatricula(rs.getInt("matriculafuncionario"));
            os.getCliente().setCpf(rs.getString("cpfcliente"));
            os.getClassificacao().setCodigo(rs.getInt("codigoclassProblema"));

            os.getCliente().setNome(rs.getString("nomecliente"));
            os.getCliente().setRg(rs.getString("rgcliente"));
            os.getFuncionario().setSalario(rs.getDouble("salariofuncionario"));
            os.getFuncionario().setNome(rs.getString("nomefuncionario"));
            os.getFuncionario().setRg(rs.getString("rgfuncionario"));
            os.getFuncionario().setCpf(rs.getString("cpffuncionario"));
            os.getClassificacao().setNome(rs.getString("nomeClassProblema"));
            os.getClassificacao().setDescricao(rs.getString("descricaoClassProblema"));
            retorno.add(os);
        }
        super.fecharConexao();
        return retorno;
    }

    @Override
    public void cancelarOrdemServico(OrdemServico ordemServico) throws Exception {
        abrirConexao();

        String SQL = "Update ordemservico Set datacancelamento = ?, motivocancelamento = ? Where numero = ?";

        PreparedStatement preparedStatement = coon.prepareStatement(SQL);

        preparedStatement.setDate(1, (Date) ordemServico.getDataCancelamento());
        preparedStatement.setString(2, ordemServico.getMotivoCancelamento());
        preparedStatement.setInt(3, ordemServico.getNumero());

        preparedStatement.executeUpdate();

        fecharConexao();
    }

    @Override
    public void solucionarOrdemServico(OrdemServico ordemServico) throws Exception {
        abrirConexao();

        String SQL = "Update ordemservico Set datasolucao = ?, descricaoservico = ? Where numero = ?";

        PreparedStatement preparedStatement = coon.prepareStatement(SQL);

        preparedStatement.setDate(1, (Date) ordemServico.getDataSolucao());
        preparedStatement.setString(2, ordemServico.getDescricaoServico());
        preparedStatement.setInt(3, ordemServico.getNumero());

        preparedStatement.executeUpdate();

        fecharConexao();
    }

    @Override
    public ArrayList<OrdemServico> listarOrdemServicoAberta(OrdemServico ordemServico) throws Exception {
        abrirConexao();
        ArrayList<OrdemServico> retorno = new ArrayList<>();
        String sql = "Select Os.numero as numeroOrdem, Os.motivocancelamento as motivoCancelamentoOrdem, Os.datacadastro as dataCadastroOrdem, Os.datasolucao as dataSolucaoOrdem, \n"
                + "Os.descricaoproblema as descProblemaOrdem, Os.descricaoservico as descServicoOrdem, Os.datacancelamento as dataCancelamentoOrdem, \n"
                + "\n"
                + "Fun.matricula As matriculafuncionario, Fun.salario as salariofuncionario, Fun.nome as nomefuncionario, Fun.rg as rgfuncionario, Fun.cpf as cpffuncionario, \n"
                + "\n"
                + "Cli.cpf as cpfcliente, Cli.nome as nomecliente, Cli.rg as rgcliente, \n"
                + "\n"
                + "ClassP.codigo as codigoclassProblema, ClassP.nome as nomeClassProblema, ClassP.descricao as descricaoClassProblema\n"
                + "\n"
                + "\n"
                + "FROM ordemservico As Os \n"
                + "Join cliente As Cli On Os.cpf_cliente = Cli.cpf \n"
                + "Join funcionario As Fun on Os.matricula_funcionario = Fun.matricula \n"
                + "Join classificacaoproblema As ClassP On Os.codigo_classificacao = ClassP.codigo \n"
                + "WHERE Os.motivocancelamento Is Null And Os.datasolucao Is Null And Os.datacancelamento Is Null And Os.descricaoservico Is Null  ";
        if (ordemServico.getCliente().getCpf() != null && ordemServico.getCliente().getCpf().trim().equals("") == false) {
            sql += " and Cli.cpf LIKE  ? ";
        }
        if (ordemServico.getCliente().getRg() != null && ordemServico.getCliente().getRg().trim().equals("") == false) {
            sql += " and Cli.rg LIKE  ? ";
        }
        if (ordemServico.getCliente().getNome() != null && ordemServico.getCliente().getNome().trim().equals("") == false) {
            sql += " and Cli.nome LIKE  ? ";
        }
        if (ordemServico.getFuncionario().getCpf() != null && ordemServico.getFuncionario().getCpf().trim().equals("") == false) {
            sql += " and Fun.cpf LIKE  ? ";
        }
        if (ordemServico.getFuncionario().getNome() != null && ordemServico.getFuncionario().getNome().trim().equals("") == false) {
            sql += " and Fun.nome LIKE  ? ";
        }
        if (ordemServico.getFuncionario().getRg() != null && ordemServico.getFuncionario().getRg().trim().equals("") == false) {
            sql += " and Fun.rg LIKE  ? ";
        }
        if (ordemServico.getFuncionario().getSalario() != 0) {
            sql += " and Fun.salario = ? ";
        }
        if (ordemServico.getFuncionario().getMatricula() != 0) {
            sql += " and Fun.matricula = ? ";
        }
        PreparedStatement preparedStatement = coon.prepareStatement(sql);

        int pos = 1;

        if (ordemServico.getCliente().getCpf() != null && ordemServico.getCliente().getCpf().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getCliente().getCpf() + "%");
            pos++;
        }
        if (ordemServico.getCliente().getRg() != null && ordemServico.getCliente().getRg().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getCliente().getRg() + "%");
            pos++;
        }
        if (ordemServico.getCliente().getNome() != null && ordemServico.getCliente().getNome().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getCliente().getNome() + "%");
            pos++;
        }
        if (ordemServico.getFuncionario().getCpf() != null && ordemServico.getFuncionario().getCpf().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getFuncionario().getCpf() + "%");
            pos++;
        }
        if (ordemServico.getFuncionario().getNome() != null && ordemServico.getFuncionario().getNome().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getFuncionario().getNome() + "%");
            pos++;
        }
        if (ordemServico.getFuncionario().getRg() != null && ordemServico.getFuncionario().getRg().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getFuncionario().getRg() + "%");
            pos++;
        }
        if (ordemServico.getFuncionario().getSalario() != 0) {
            preparedStatement.setDouble(pos, ordemServico.getFuncionario().getSalario());
            pos++;
        }
        if (ordemServico.getFuncionario().getMatricula() != 0) {
            preparedStatement.setInt(pos, ordemServico.getFuncionario().getMatricula());
            pos++;
        }
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            OrdemServico os = new OrdemServico();
            os.setNumero(rs.getInt("numeroOrdem"));
            os.setMotivoCancelamento(rs.getString("motivoCancelamentoOrdem"));
            os.setDataCadastro(rs.getDate("dataCadastroOrdem"));
            os.setDataSolucao(rs.getDate("dataSolucaoOrdem"));
            os.setDescricaoProblema(rs.getString("descProblemaOrdem"));
            os.setDescricaoServico(rs.getString("descServicoOrdem"));
            os.setDataCancelamento(rs.getDate("dataCancelamentoOrdem"));
            os.getFuncionario().setMatricula(rs.getInt("matriculafuncionario"));
            os.getCliente().setCpf(rs.getString("cpfcliente"));
            os.getClassificacao().setCodigo(rs.getInt("codigoclassProblema"));

            os.getCliente().setNome(rs.getString("nomecliente"));
            os.getCliente().setRg(rs.getString("rgcliente"));
            os.getFuncionario().setSalario(rs.getDouble("salariofuncionario"));
            os.getFuncionario().setNome(rs.getString("nomefuncionario"));
            os.getFuncionario().setRg(rs.getString("rgfuncionario"));
            os.getFuncionario().setCpf(rs.getString("cpffuncionario"));
            os.getClassificacao().setNome(rs.getString("nomeClassProblema"));
            os.getClassificacao().setDescricao(rs.getString("descricaoClassProblema"));
            retorno.add(os);
        }
        fecharConexao();
        return retorno;
    }
}
