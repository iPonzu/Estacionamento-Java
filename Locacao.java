import java.util.ArrayList;

public class Locacao {
 
    private int id;
    private String data;

    private static ArrayList<Locacao> locacoes = new ArrayList<Locacao>();

    public Locacao(
        int id,
        String data
    ){
        this.id = id;
        this.data = data;
    
        locacoes.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static Locacao getLocacao(int id) throws Exception{
        for (Locacao locacao : locacoes) {
            if (locacao.getId() == id) {
                return locacao;
            }
        }
        throw new Exception("Locação não encontrada");
    }

    public static void removeLocacao(int id) throws Exception{
        Locacao locacao = getLocacao(id);
        locacoes.remove(locacao);
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n"
        + "Data: " + data + "\n";
    }
}
