package COMPUTADOR_DE_BORDO;

public class Toyota extends Carro implements ON_OFF{

	public Toyota(String nome, int marcha, int velocidade, int rPM) {
		super(nome, marcha, velocidade, rPM);
		// TODO Auto-generated constructor stub
	}
	
	public Toyota(String nome) {
		super(nome);
	}
	
	public void acerelar() {
	    if(this.Velocidade<200) {
	    	this.Velocidade += 25;
	    	System.out.println("Velocidade: " + this.Velocidade + "km/h");
	    	this.RPM += 3500;
		    System.out.println("RPM: " + this.RPM);
		    
		    if (this.RPM >= 4300) {
		    	if(this.marcha<10) {
		    		this.marcha++;
		    	}
		    	this.RPM = 2350;
		    }
		    System.out.println("Marcha: " + this.marcha);
	    }else {
	    	System.out.println(">>>Velocidade maxima atingida!!<<<");
	    	this.Velocidade = 200;
	    	System.out.println("\n\n\nVelocidade: " + this.Velocidade + "km/h");
	    	this.marcha = 10;
	    	System.out.println("Marcha: " + this.marcha);
	    	this.RPM = 6450;
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
	        this.Velocidade -= 50;
	    } else {
	        this.Velocidade = 0;
	    }

	    System.out.println("RPM: " + this.RPM);
	    System.out.println("Velocidade: " + this.Velocidade + " km/h");
	}

	
	
}
