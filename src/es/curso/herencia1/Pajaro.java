package es.curso.herencia1;

public class Pajaro extends Animal{
    private String tipoPluma;
    
    
	public Pajaro() {
		super();
	}

	public Pajaro(String tipoPluma) {
		super();
		this.setTipoPluma(tipoPluma);
	}
    
	public Pajaro(String nombre, int numPatas, String tipoPluma) {
		super(nombre, numPatas);
		this.setTipoPluma(tipoPluma);
	}

	@Override
	public void emitirSonido() {
		System.out.println("pipirripipí");
		
	}
	
	public void ponerHuevos(){
		// este método es particular del los pájaros
		System.out.println("Pájaro poniendo huevos");
	}
	public void volar(){
		System.out.println("Pájaro volando");
	}

	public String getTipoPluma() {
		return tipoPluma;
	}

	public void setTipoPluma(String tipoPluma) {
		this.tipoPluma = tipoPluma;
	}

}















