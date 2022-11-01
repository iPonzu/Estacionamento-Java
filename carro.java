import java.util.ArrayList;

public class Carro extends Veiculo {

    private String placa; 
    private String cor;

    public static ArrayList<Carro> carros = new ArrayList<>();

    public Carro(
        int id, 
        String nome, 
        String placa, 
        String cor
    ) {
        super(id, nome);
        this.placa = placa;
        this.cor = cor;

        carros.add(this);
    }    

    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }    
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }    
    public static Carro getCarro(int id) throws Exception{
        for (Carro carro : carros){
            if(carro.getId() == id){
                return carro;
            }
        }
        throw new Exception("Carro não encontrado");
    }
    
    public static void removeCarro(int id) throws Exception{
        Carro carro = getCarro(id);
        carros.remove(carro);
    }

    @Override
    public String toString(){
        return "Id:" + super.getId() + "\n"
        + "Nome: " + super.getNome() + "\n"
        + "Placa: " + this.getPlaca() + "\n"
        + "Cor: " + this.getCor() + "\n";
    }
}