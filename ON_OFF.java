package COMPUTADOR_DE_BORDO;

import java.util.Scanner;

public interface ON_OFF {

	
	Scanner sc = new Scanner(System.in);
	
	public default void MENU(){
		System.out.println("Deseja Ligar o veiculo?");
		System.out.println("Digite 1 para (Sim) \nDigite 2 para Não");
		int op = sc.nextInt();
		
		if(op == 1) {
			System.out.println("O veiculo foi Ligado!!");
		}else {
			System.out.println("O veiculo não foi ligado!");
		}
		
	}
}
