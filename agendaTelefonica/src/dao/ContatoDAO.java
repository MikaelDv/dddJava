package dao;
// é a classe responsável por manipular os dados no banco de dados
// implementando o CRUD

import models.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ContatoDAO {

    public void cadastrarContato(Contato contato){
        Connection conexao = ConnectionFactory.obterConnection();
        PreparedStatement comandoSQL = null;
        String sql = "insert into tbl_contato(ID_CONTATO, NOME_CONTATO, CELULAR_CONTATO, EMAIL_CONTATO," +
                " INSTAGRAM, TIPO) values (?,?,?,?,?,?)";
        try {
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setInt(1, contato.getCodigo());
            comandoSQL.setString(2, contato.getNome());
            comandoSQL.setString(3, contato.getTelefone());
            comandoSQL.setString(4, contato.getEmail());
            comandoSQL.setString(5, contato.getInstagram());
            comandoSQL.setString(6, contato.getTipoContato().toString());
            comandoSQL.executeUpdate();

            comandoSQL.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void lerContatos() {
        Connection conexao = ConnectionFactory.obterConnection();
        PreparedStatement comandoSQL = null;
        String sql = "select * from tbl_contato";
        try {
            comandoSQL = conexao.prepareStatement(sql);
            ResultSet resultado = comandoSQL.executeQuery();

            System.out.println("_____________________________________________");
            while (resultado.next()) {
                int codigo = resultado.getInt("ID_CONTATO");
                String nome = resultado.getString("NOME_CONTATO");
                String telefone = resultado.getString("CELULAR_CONTATO");
                String email = resultado.getString("EMAIL_CONTATO");
                String instagram = resultado.getString("INSTAGRAM");
                String tipoContato = resultado.getString("TIPO");

                System.out.println("ID: " + codigo + "\nNOME: " + nome + "\nTELEFONE: " + telefone
                + "\nEMAIL: " + email + "\nINSTAGRAM: " + instagram + "\nTIPO: " + tipoContato);
                System.out.println("_____________________________________________");
            }

            comandoSQL.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
