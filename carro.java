import java.util.ArrayList;

public class carro extends veiculo{

    private String placa;

    public static ArrayList<carro> carros = new ArrayList<carro>();

    public carro(String placa, int cor){
        super();
        this.placa = placa;

    
        
    }

    public String getPlaca(){
        return placa;
    }
    public void setPlaca (String placa){
        this.placa = placa;
    }
    
}
