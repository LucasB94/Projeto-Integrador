package base;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class OsirisDAO {

    private Conexao osirisconexao;
    private Connection conn;

    public OsirisDAO() {
        this.osirisconexao = new Conexao();
        this.conn = this.osirisconexao.getConexao();
    }

    public void InserirCadastro(Cadastro cadastro) {
        String sql = "INSERT INTO Cadastro(nome, contato, CPF, email) VALUES " + "(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getContato());
            stmt.setString(3, cadastro.getCPF());
            stmt.setString(4, cadastro.getEmail());
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir o cadastro: " + e.getMessage());
        }
    }

    public void InserirVaga(Vaga vaga) {
        String sql = "INSERT INTO Reserva(nome, contato, email) VALUES " + "(?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, vaga.getNome());
            stmt.setString(2, vaga.getContato());
            stmt.setString(3, vaga.getEmail());
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir a reserva: " + e.getMessage());
        }
    }

    public void InserirAjuda(Ajuda ajuda) {
        String sql = "INSERT INTO Ajuda(escrita) VALUES " + "(?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, ajuda.getEscrita());
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir a ajuda: " + e.getMessage());
        }
    }

 }
