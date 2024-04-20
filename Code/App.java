package COMPUTADOR_DE_BORDO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in); // Scanner para números
        Scanner si = new Scanner(System.in); // Scanner para Strings

        boolean sair = false;
        
        List<String> hist = new ArrayList<String>();
        //Map<recebe String e devolve um inteiro>
        
        Map<String, Integer> cont = new HashMap<String, Integer>();

        System.out.println("Digite o número da montadora que deseja implementar:");
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
                    System.out.println("Digite 4 para visualizar o historico: ");
                    int opc = sn.nextInt();
                    switch (opc) {
                        case 1:
                            h.MENU(); 
                            //Add o menu ao historico
                            hist.add("Menu console");
                            //Usando o map ele recebe uma string e passa devolve um inteiro fazedno a incrementação 
                            cont.put("Menu", cont.getOrDefault("Menu", 0)+1);
                            break;
                        case 2:
                            h.acelerar();
                            hist.add("Acerelar");	
                            cont.put("Acerelar", cont.getOrDefault("Acerelar", 0)+1);                
                            break;
                        case 3:
                            h.freiar();
                            hist.add("Freiar");
                            cont.put("Freiar", cont.getOrDefault("Freiar", 0)+1);
                            break;
                        case 4: 
                        	hist.add("Visualizar historico");
                        	for(String metodo: cont.keySet()) {
                        		int contagem = cont.get(metodo);
                        		System.out.println(metodo + "->" + contagem);
                        	}
                        	System.out.println();//quebra de linha
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
                    System.out.println("Digite 4 para visualizar o historico: ");
                    int opc = sn.nextInt();
                    switch (opc) {
                        case 1:
                            t.MENU();
                            hist.add("Menu");
                            cont.put("Menu", cont.getOrDefault("Menu", 0)+1);
                            break;
                        case 2:
                            t.acerelar();
                            hist.add("Acerelar");
                            cont.put("Acerelar", cont.getOrDefault("Acerelar", 0)+1);
                            break;
                        case 3:
                            t.freiar();
                            hist.add("Freiar");
                            cont.put("Freiar", cont.getOrDefault("Freiar", 0)+1);
                            break;
                        case 4:
                        	hist.add("Visualizar historico");
                        	for(String metodo: cont.keySet()) {
                        		int contagem = cont.get(metodo);
                        		System.out.println(metodo + "->" + contagem);
                        	}
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
                            hist.add("Menu");
                            cont.put("Menu", cont.getOrDefault("Menu", 0)+1);
                            break;
                        case 2:
                            vw.acerelar(); 
                            hist.add("Acerelar");
                            cont.put("Acerelar", cont.getOrDefault("Acerelar", 0)+1);
                            break;
                        case 3:
                            vw.freiar(); 
                            hist.add("Freiar");
                            cont.put("Freiar", cont.getOrDefault("Freiar", 0)+1);
                            break;
                        case 4:
                        	hist.add("Visualizar historico");
                        	for(String metodo: cont.keySet()) {
                        		int contagem = cont.get(metodo);
                        		System.out.println(metodo + "->" + contagem);
                        	}
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
