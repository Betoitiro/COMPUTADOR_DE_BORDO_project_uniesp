package COMPUTADOR_DE_BORDO;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in); // Scanner para números
        Scanner si = new Scanner(System.in); // Scanner para Strings

        boolean sair = false;

        System.out.println("Qual montadora deseja implementar:");
        System.out.println("Opção 1: Honda\nOpção 2: Toyota\nOpção 3: VW");
        int op = sn.nextInt();

        switch (op) {
            case 1: {
                System.out.println("A montadora escolhida foi a Honda!");
                System.out.println("Informe o veículo que deseja utilizar: ");
                String nome = si.nextLine();
                Honda h = new Honda(nome);
                System.out.println("O veículo escolhido foi o " + nome);
                System.out.println("\n\n\n");

                while (!sair) {
                    System.out.println("Digite 0 para sair: ");
                    System.out.println("Digite 1 para ir ao menu do console: ");
                    System.out.println("Digite 2 para acelerar o carro: ");
                    System.out.println("Digite 3 para frear: ");
                    int opc = sn.nextInt();
                    switch (opc) {
                        case 1:
                            h.MENU(); 
                            break;
                        case 2:
                            h.acelerar();
                            break;
                        case 3:
                            h.freiar();
                            break;
                        case 0:
                            sair = true;
                            break;
                        default:
                            throw new IllegalArgumentException("Valor inesperado: " + opc);
                    }
                }
                break;
            }
            case 2: {
                System.out.println("A montadora escolhida foi a Toyota!");
                System.out.println("Informe o veículo que deseja utilizar: ");
                String nome = si.nextLine();
                Toyota t = new Toyota(nome);
                System.out.println("O veículo escolhido foi o " + nome);
                System.out.println("\n\n\n");

                while (!sair) {
                    System.out.println("Digite 0 para sair: ");
                    System.out.println("Digite 1 para ir ao menu do console: ");
                    System.out.println("Digite 2 para acelerar o carro: ");
                    System.out.println("Digite 3 para frear: ");
                    int opc = sn.nextInt();
                    switch (opc) {
                        case 1:
                            t.MENU(); 
                            break;
                        case 2:
                            t.acerelar();
                            break;
                        case 3:
                            t.freiar();
                            break;
                        case 0:
                            sair = true;
                            break;
                        default:
                            throw new IllegalArgumentException("Valor inesperado: " + opc);
                    }
                }
                break;
            }
            case 3: {
                System.out.println("A montadora escolhida foi a VW!");
                System.out.println("Informe o veículo que deseja utilizar: ");
                String nome = si.nextLine();
                VW vw = new VW(nome); 
                System.out.println("O veículo escolhido foi o " + nome);
                System.out.println("\n\n\n");

                while (!sair) {
                    System.out.println("Digite 0 para sair: ");
                    System.out.println("Digite 1 para ir ao menu do console: ");
                    System. out.println("Digite 2 para acelerar o carro: ");
                    System.out.println("Digite 3 para frear: ");
                    int opc = sn.nextInt();
                    switch (opc) {
                        case 1:
                            vw.MENU();
                            break;
                        case 2:
                            vw.acerelar(); 
                            break;
                        case 3:
                            vw.freiar(); 
                            break;
                        case 0:
                            sair = true;
                            break;
                        default:
                            throw new IllegalArgumentException("Valor inesperado: " + opc);
                    }
                }
                break;
            }
            default:
                throw new IllegalArgumentException("Valor inesperado: " + op);
        }
    }
}
