package es.curso.herencia2;

public abstract class Empleado {
	 private String nombre;
	 private String apellido;
	 private String dni;
	 private double salarioMes;
	public Empleado() {
		super();
	}
	public Empleado(String nombre, String apellido, String dni,
			double salarioMes) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.salarioMes = salarioMes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSalarioMes() {
		return salarioMes;
	}
	public void setSalarioMes(double salarioMes) {
		this.salarioMes = salarioMes;
	}
	 
    public abstract  void calcularSalario();
	
    @Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", salarioMes=" + salarioMes + "]";
	}
    
    
}























