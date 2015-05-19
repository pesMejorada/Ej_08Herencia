package es.curso.herencia2;

public class EmpleadoTemporal extends Empleado{
    private int numHoras;
    private double valorHora;
    
    
    public int getNumHoras() {
		return numHoras;
	}


	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}


	public EmpleadoTemporal() {
		super();
	}
	public EmpleadoTemporal(String nombre, String apellido, String dni,
			double salarioMes, double valorHora, int numHoras) {
		super(nombre, apellido, dni, salarioMes);
		this.numHoras=numHoras;
	    this.valorHora=valorHora;
	}
	@Override
	public void calcularSalario() {
		setSalarioMes(this.getValorHora()*this.getNumHoras());
	}

	@Override
	public String toString() {
		return "EmpleadoTemporal [numHoras=" + numHoras + ", valorHora="
				+ valorHora + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getDni()=" + getDni()
				+ ", getSalarioMes()=" + getSalarioMes() + "]";
	}
}

















