import java.util.Scanner;

import javax.crypto.ExemptionMechanismException;

public class Estacionamento {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Estacionamento");
        System.out.println("Seja bem-vindo ao Plaza Park");

        do{
            System.out.println("==========================");
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
            System.out.println("==========================");

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
                    removeCarro(scanner); 
                    break;    
                case 4: 
                    cadastrarMoto(scanner);
                    break;
                case 5: 
                    listarMoto();
                    break;
                case 6: 
                    removeMoto(scanner);
                    break;   
                case 7:
                    cadastrarBicicleta(scanner);
                    break;
                case 8:
                    listarBicicleta();
                    break;
                case 9: 
                    removeBicicleta(scanner);
                    break;
                case 10: 
                    cadastrarVaga(scanner);
                    break;
                case 11:
                    listarVaga();
                    break;   
                case 12:
                    removeVaga(scanner);
                    break;     
                case 13:
                    cadastrarLocação(scanner);
                    break;
                case 14:
                    listarLocação();
                    break;
                case 15:
                    removeLocacao(scanner); 
                    break;   
            }
        }while(opcao!= 0);
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
    public static void listarMoto(){
        for(Moto moto : Moto.motos){
            System.out.println(moto);
        }
    }


    public static void removeMoto (Scanner scanner){
        System.out.println("Remover Moto");
        System.out.println("Digite o ID da moto: ");
        int idMoto = scanner.nextInt();
        try{
            Moto.removeMoto(idMoto);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void cadastrarBicicleta(Scanner scanner){
        try{
            System.out.println("Cadastrar Bicicleta");
            System.out.println("Digite o ID da Bicicleta: ");
            int id = scanner.nextInt();
            System.out.println("Nome: ");
            String nome = scanner.next();
            System.out.println("Marca: ");
            String marca = scanner.next();
            System.out.println("Cor: ");
            String cor = scanner.next();

            new Bicicleta(id, nome, marca, cor);
        }catch(Exception e){
            System.out.println("Erro ao cadastrar a Bicicleta");
        }
    }

    public static void listarBicicleta(){
        for (Bicicleta bicicleta : Bicicleta.bicicletas){
            System.out.println(bicicleta);
        }    
    }

    public static void removeBicicleta(Scanner scanner){
        System.out.println("Remover Bicicleta");
        System.out.println("Informe o ID da Moto: ");
        int idBicicleta = scanner.nextInt();
        try{
            Bicicleta.removeBicicleta(idBicicleta);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void cadastrarVaga(Scanner scanner){
        try{
            System.out.println("Cadastrar Vaga");
            System.out.println("Digite o ID da vaga: ");
            int id = scanner.nextInt();
            System.out.println("Número da vaga: ");
            String numero = scanner.next();
            System.out.println("Tamanho: ");
            String tamanho = scanner.next();
           
        System.out.println("Digite a quantidade de vagas: ");
        int quantidade = scanner.nextInt();

        for(int i = 0; i < quantidade; i++){
            System.out.println("Tipo de veículo: ");
            String tipo = scanner.next();
            switch(tipo){
                case "C":
                    tipo = "Carro";
                    break;
                case "M":
                    tipo = "Moto";
                    break;
                case "B":
                    tipo = "Bicicleta";
                    break;
                default:
                    throw new Exception("Tipo inválido!");    
            }
            String tamanho = scanner.next();
            System.out.println("Preço: ");
            String preço = scanner.next();

            new Vaga(numero, tipo, tamanho, preço);
        }
        }catch(Exception e){
            System.out.println("Erro ao cadastrar a Vaga");
        }
    }

    public static void listarVaga(){
        for(Vaga vaga : Vaga.vagas){
            System.out.println(vaga);
        }
    }

    public static void removeVaga (Scanner scanner){
        System.err.println("Remover Vaga");
        System.out.println("Digite o ID da Vaga: ");
        int idVaga = scanner.nextInt();
        try{
            Vaga.removeVaga(idVaga);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void cadastrarLocação (Scanner scanner){
        try{
        System.out.println("Cadastrar Locação");
        System.out.println("Digite o ID da locação");
        int id = scanner.nextInt();
        System.out.println("Data da locação: ");
        String data = scanner.next();

        new Locacao(id, data);
        }catch (Exception e){
            System.out.println("Erro ao cadastrar a Locação!");
        }
    }

    public static void listarLocação(){
        for(Locacao locacao : Locacao.locacoes){
            System.out.println(locacao);
        }
    }

    public static void removeLocacao(Scanner scanner){
        System.out.println("Remover Locação");
        System.out.println("Digite o ID da locação: ");
        int id = scanner.nextInt();
        try{
            Locacao.removeLocacao(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
