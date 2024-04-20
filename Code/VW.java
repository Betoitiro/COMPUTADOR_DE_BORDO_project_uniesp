package COMPUTADOR_DE_BORDO;

public class VW extends Carro implements ON_OFF{

	public VW(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public void acerelar() {
	    if(this.Velocidade<200) {
	    	this.Velocidade += 38;
	    	System.out.println("Velocidade: " + this.Velocidade + "km/h");
	    	this.RPM += 4000;
		    System.out.println("RPM: " + this.RPM);
		    
		    if (this.RPM > 5500) {
		    	if(this.marcha<6) {
		    		this.marcha++;
		    	}
		    	this.RPM = 2350;
		    }
		    System.out.println("Marcha: " + this.marcha);
	    }else {
	    	System.out.println(">>>Velocidade maxima atingida!!<<<");
	    	this.Velocidade = 300;
	    	System.out.println("\n\n\nVelocidade: " + this.Velocidade + "km/h");
	    	this.marcha = 6;
	    	System.out.println("Marcha: " + this.marcha);
	    	this.RPM = 7000;
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
