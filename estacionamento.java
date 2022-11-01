import java.util.Scanner;

public class Estacionamento {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Estacionamento");
        System.out.println("Seja bem-vindo ao Parking Lot");

        do{
            System.out.println("Escolha uma opção");
            System.out.println("1 - Cadastrar Carro: ");
            System.out.println("2 - Listar Carro: ");
            System.out.println("3 - Remover Carro: ");
            System.out.println("4 - Cadastrar Moto: ");
            System.out.println("5 - Listar Moto: ");
            System.out.println("6 - Remover Moto: ");
            System.out.println("7 - Cadastrar Bicicleta: ");
            System.out.println("8 - Listar Bicicleta: ");
            System.out.println("9 - Remover Bicicleta: ");
            System.out.println("10 - Cadastrar Vaga: ");
            System.out.println("11 - Listar Vaga: ");
            System.out.println("12 - Remover Vaga: ");
            System.out.println("13 - Cadastrar Locação: ");
            System.out.println("14 - Listar Locação: ");
            System.out.println("15 - Remover Locação: ");

            try{
                opcao = scanner.nextInt();
            }catch (Exception e){
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    cadastrarCarro(scanner);
                    break;
                case 2: 
                    listarCarro();
                    break;    
                case 3: 
                    cadastrarMoto(scanner);
                    break;
                case 4: 
                    listarMoto();
                    break;
                case 5:
                    cadastrarBicicleta(scanner);
                    break;
                case 6:
                    listarBicicleta();
                    break;
                case 7:
                    cadastrarVaga(scanner);
                    break;
                case 8:
                    listarVaga();
                    break;    
                case 9:
                    cadastrarLocação(scanner);
                    break;
                case 10:
                    listarLocação();
                    break;
            }
        }while(opcao!= 8);
        scanner.close();
    } 

    public static void cadastrarCarro(Scanner scanner){
        try{
        System.out.println("Cadastrar Carro");
        System.out.println("Digite o ID do carro: ");
        int id = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Placa: ");
        String placa = scanner.next();
        System.out.println("Cor: ");
        String cor = scanner.next();

        new Carro(id, nome, placa, cor);
    }catch(Exception e){
        System.out.println("Erro ao cadastrar Carro");
    }

    }

    public static void listarCarro(){
        for(Carro carro : Carro.carros){
            System.out.println(carro);
        }
    }

    public static void removeCarro (Scanner scanner){
        System.out.println("Remover Carro");
        System.out.println("Informe a placa: ");
        String placa = scanner.next();
        System.out.println("Digite o ID do carro: ");
        int idCarro = scanner.nextInt();
        try{
            Carro.removeCarro(idCarro);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
     }
     public static void cadastrarMoto(Scanner scanner){
        try{
        System.out.println("Cadastrar Moto");
        System.out.println("Digite o ID do moto: ");
        int idMoto = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Placa: ");
        String placa = scanner.next();
        System.out.println("Cilindrada: ");
        String cilindrada = scanner.next();

        new Moto(idMoto, nome, placa, cilindrada);
        }catch (Exception e){
            System.out.println("Erro ao cadastrar Moto");
        }
    }
}
