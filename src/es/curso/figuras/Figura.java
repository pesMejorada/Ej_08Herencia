package es.curso.figuras;

public abstract class Figura {
    protected String nombre;

     //METODOS
    public Figura(String nombre)
    {
        this.nombre = nombre;
    }
   
  
    public abstract double obtenerArea();
    
    public abstract double obtenerVolumen();
    
    public  String obtenerNombre()
    {
    return this.nombre;
    }

}
