package es.curso.herencia1;

public abstract class Animal {
	private String nombre;
	private int numPatas;
	public Animal() {
		super();
	}
	public Animal(String nombre, int numPatas) {
		super();
		this.nombre = nombre;
		this.numPatas = numPatas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
	public abstract void emitirSonido();

}
















