import java.util.ArrayList;

public class Floricultura {
    private ArrayList<Flor> flores = new ArrayList<>();

    public void cadastrar(Flor flor){
        flores.add(flor);
        System.out.println(flor.getProduto() + " cadastrada com sucesso!");
    }

    public ArrayList<Flor> getFlores() {
        return flores;
    }

    public void setFlores(ArrayList<Flor> flores) {
        this.flores = flores;
    }
}
