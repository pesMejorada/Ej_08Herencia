package es.curso.figuras;

public class Circulo extends Punto {
   protected  double radio;

   public Circulo(int x, int y, double radio) {
        super(x,y);
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * this.radio * 2;
    }

    @Override
    public double obtenerVolumen() {
        return 0.0;
    }

   public String toString()
    {
       return super.toString() + " Radio:" + this.radio + "Area: "+  this.obtenerArea() + "Volumen: "+  this.obtenerVolumen();
   }



}
