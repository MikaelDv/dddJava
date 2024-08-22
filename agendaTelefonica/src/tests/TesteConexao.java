package tests;

import dao.ConnectionFactory;
import dao.ContatoDAO;
import enums.TipoContatoEnum;
import models.Contato;

public class TesteConexao {
    public static void main(String[] args) {
        System.out.println("Teste de conexão com banco de dados");
        if(ConnectionFactory.obterConnection() == null){
            System.out.println("Erro ao estabelecer conexão");
        } else {
            System.out.println("Conexão estabelecida com sucesso!");
        }

        Contato Mikas = new Contato();
        Mikas.setCodigo(1102);
        Mikas.setNome("Mikas");
        Mikas.setEmail("mikas@gmail.com");
        Mikas.setTelefone("1140028922");
        Mikas.setInstagram("@011mikael");
        Mikas.setTipoContato(TipoContatoEnum.AMIGO);

        ContatoDAO contatoDao = new ContatoDAO();

        contatoDao.lerContatos();
    }
}
