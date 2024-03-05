import java.time.LocalDate;

public class Pessoa {

    String nome;

    LocalDate nascimento;

    String faleOsSeusDadosBasicos(){
        return
            "Olá, meu nome é "
                    + nome + ", nasci em "
                    + nascimento.getDayOfMonth() + " de "
                    + nascimento.getMonth() + " de "
                    + nascimento.getYear();
    }
}