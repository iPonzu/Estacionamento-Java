import java.util.ArrayList;

public abstract class Veiculo{

    private int id;
    private String nome;

    protected Veiculo(
        int id, 
        String nome
    ) {
        this.setId(id);
        this.setNome(nome);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Id: " + id + "\n"
        + "Nome: " + nome + "\n";
    }    
}
