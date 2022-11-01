import java.util.ArrayList;

public class Moto extends Veiculo{

    private String placa;
    private String cilindrada;

    private static ArrayList<Moto> motos = new ArrayList<Moto>();
    public Moto(
        int id,
        String nome,
        String placa, 
        String cilindrada
    ){
        super(id, nome);
        this.placa = placa;
        this.cilindrada = cilindrada;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getCilindrada(){
        return cilindrada;
    }
    
    public void setCilindrada(String cilindrada){
        this.cilindrada = cilindrada;
    }
    
    public static Moto getMoto(int id) throws Exception{
        for(Moto moto : motos){
            if(moto.getId() == id){
                return moto;
            }
        }
        throw new Exception ("Moto não encontrado");
    }

    @Override 
    public String toString() {
        return "Id: " + super.getId() + "\n"
        + "Nome: " + super.getNome() + "\n"
        + "Placa: " + this.getPlaca() + "\n"
        + "Cilindrada: " + this.getCilindrada() + "\n";
    }
}
