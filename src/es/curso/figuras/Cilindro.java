package es.curso.figuras;

public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(int x, int y, double radio, double altura) {
        super(x, y, radio);
        this.altura = altura;
    }


    

    @Override
    public double obtenerArea() {
        return super.obtenerArea()+ 2 * Math.PI * this.radio * this.altura;

    }

    @Override
    public double obtenerVolumen() {
        return Math.PI * this.radio * this.radio;
    }
    public String toString()
    {
       return super.toString() + " Radio:" + this.radio + "Altura:  " + this.altura + "Area: "+  this.obtenerArea() + "Volumen: "+  this.obtenerVolumen();
   }
}
