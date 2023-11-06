package COMPUTADOR_DE_BORDO;

public class Honda extends Carro implements ON_OFF{


	public Honda(String nome, int marcha, int velocidade, int RPM) {
		super(nome, marcha, velocidade, RPM);
		// TODO Auto-generated constructor stub
	}
	public Honda(String nome) {
		super(nome);
	}
	
	

	public void acelerar() {
	    if(this.Velocidade<250) {
	    	this.Velocidade += 30;
	    	System.out.println("Velocidade: " + this.Velocidade + "km/h");
		    this.RPM += 2000;
		    System.out.println("RPM: " + this.RPM);
		    
		    if (this.RPM >= 3500) {
		    	if(this.marcha<9) {
		    		this.marcha++;
		    	}
		    	this.RPM = 1500;
		    }
		    System.out.println("Marcha: " + this.marcha);
	    }else {
	    	System.out.println(">>>Velocidade maxima atingida!!<<<");
	    	this.Velocidade = 275;
	    	System.out.println("\n\n\nVelocidade: " + this.Velocidade + "km/h");
	    	this.marcha = 9;
	    	System.out.println("Marcha: " + this.marcha);
	    	this.RPM = 5000;
	    	System.out.println("RPM: " + this.RPM);
	    }

	}
	public void freiar() {
	    if (this.RPM > 1000) {
	        this.RPM -= 1000;
	    } else {
	        this.RPM = 1000;
	    }

	    if (this.Velocidade > 0) {
	        this.Velocidade -= 25;
	    } else {
	        this.Velocidade = 0;
	    }

	    System.out.println("RPM: " + this.RPM);
	    System.out.println("Velocidade: " + this.Velocidade + " km/h");
	}

}
