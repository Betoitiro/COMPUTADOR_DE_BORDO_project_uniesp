package COMPUTADOR_DE_BORDO;

public class Carro{

	protected String nome;
	protected int marcha = 1;
	protected int Velocidade = 0;
	protected int RPM =2000;
	
	public Carro(String nome, int marcha, int velocidade, int rPM) {
		super();
		this.nome = nome;
		this.marcha = marcha;
		Velocidade = velocidade;
		RPM = rPM;
	}

	
	public Carro(String nome) {
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}

	public int getRPM() {
		return RPM;
	}

	public void setRPM(int rPM) {
		RPM = rPM;
	}
	
	
	
	
}
