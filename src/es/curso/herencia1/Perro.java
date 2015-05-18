package es.curso.herencia1;

public class Perro extends Animal {
	private String tipoPelo;

	public Perro() {
		super();
	}
	
	public Perro(String tipoPelo) {
		super();
		this.tipoPelo = tipoPelo;
	}
    
	
  	public Perro(String nombre, int numPatas, String tipoPelo) {
		super(nombre, numPatas);
		this.tipoPelo= tipoPelo;
		
	}

	public String getTipoPelo() {
		return tipoPelo;
	}

	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}


	public void rastrear(){
		System.out.println("Perro rastreando");
	}

	@Override
	public void emitirSonido() {
		System.out.println("Guau guau");
		
	}

}
