package models;

public class RegistroVendas {
    private double total;
    //Polimorfismo
    public void adicionar(Livro item){
        System.out.println("livro adicionado" + item.getTitulo());
    }


}
