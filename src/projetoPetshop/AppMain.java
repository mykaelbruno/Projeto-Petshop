package projetoPetshop;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventarioPetshop petshop = new InventarioPetshop();
        System.out.println("Bem vindo ao Petshop Souza!");

        int opc = menuPrincipal();
        while (opc != 4) {
            switch (opc) {
                case 1:
                    ServicosPetshop banho = new Banho(petshop.getCodigo(), getTamanhoAnimal(), getTamanhoPelo());
                    petshop.adicionaServico(banho);
                    System.out.println("Serviço de banho cadastrado com sucesso!");
                    System.out.println(banho.descricao());
                    opc = menuPrincipal();
                    break;
                case 2:
                    ServicosPetshop tosa = new Tosa(petshop.getCodigo(), getTamanhoAnimal());
                    petshop.adicionaServico(tosa);
                    System.out.println("Serviço de tosa cadastrado com sucesso!");
                    System.out.println(tosa.descricao());
                    opc = menuPrincipal();
                    break;
                case 3:
                    System.out.println("Quantas horas de hospedagem: ");
                    int qntHoras = sc.nextInt();
                    sc.nextLine();
                    ServicosPetshop hotel = new Hotel(petshop.getCodigo(), getTamanhoAnimal(), qntHoras);
                    petshop.adicionaServico(hotel);
                    System.out.println("Serviço de hotel cadastrado com sucesso!");
                    System.out.println(hotel.descricao());
                    opc = menuPrincipal();
                    break;
                default:
                System.out.println("Opção inválida, tente novamente.");
                opc = menuPrincipal();
            }
        }
        System.out.println("Petshop fechado!");
        System.out.println(petshop.ListaServicos());
        System.out.println("Total recebido com serviços do dia: " + petshop.calculaValorArrecadado());
    }

    private static int menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Banho");
        System.out.println("2 - Tosa");
        System.out.println("3 - Hotel");
        System.out.println("4 - Fechar Petshop");
        int escolha = sc.nextInt();
        sc.nextLine();
        return escolha;
    }

    private static Tamanho getTamanhoAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tamanho do seu animal ?");
        System.out.println("1 - Pequeno");
        System.out.println("2 - Medio");
        System.out.println("3 - Grande");
        int tamanhoAnimal = sc.nextInt();
        sc.nextLine();
        return switch (tamanhoAnimal) {
            case 1 -> Tamanho.PEQUENO;
            case 2 -> Tamanho.MEDIO;
            case 3 -> Tamanho.GRANDE;
            default -> null;
        };
    }

    private static TamanhoPelo getTamanhoPelo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tamanho do pelo dele?");
        System.out.println("1 - Curto");
        System.out.println("2 - Medio");
        System.out.println("3 - Longo");
        int tamanhoPelo = sc.nextInt();
        sc.nextLine();
        return switch (tamanhoPelo) {
            case 1 -> TamanhoPelo.CURTO;
            case 2 -> TamanhoPelo.MEDIO;
            case 3 -> TamanhoPelo.LONGO;
            default -> null;
        };
    }
}