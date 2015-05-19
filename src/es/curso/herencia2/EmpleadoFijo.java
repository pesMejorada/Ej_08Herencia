package es.curso.herencia2;

public class EmpleadoFijo extends Empleado{
     
	public EmpleadoFijo() {
		super();
	}

	public EmpleadoFijo(String nombre, String apellido, String dni,
			double salarioMes) {
		super(nombre, apellido, dni, salarioMes);
	}

	@Override
	public void calcularSalario() {
		setSalarioMes(getSalarioMes()*2);
	}

	@Override
	public String toString() {
		return "EmpleadoFijo [Nombre:" + getNombre() + ", Apellido:"
				+ getApellido() + ", Dni:" + getDni()
				+ ", SalarioMes:" + getSalarioMes() + "]";
	}
	
}


















