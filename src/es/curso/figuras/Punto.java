package es.curso.figuras;

public class Punto extends Figura{
     private int x;
     private int y;
     /*
     * @param args the command line arguments
     */
    
    public Punto(int x, int y) {
        super("Punto");
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int darCuadrante(){
    if(this.x > 0 && this.y > 0)
        return 1;
    else
      if(this.x < 0 && this.y > 0)
         return 2;
        else
           if(this.x < 0 && this.y < 0)
             return 3;
            else
                 if(this.x > 0 && this.y < 0)
                    return 4;
                 else
                    return 0;
   }


    public void desplazarY(int espacios){
      this.y = this.y + espacios;

    }

    public void reporte()
    { System.out.println("Coordenada :" + this.x + " , " +this.y);


    }

    @Override
    public double obtenerArea() {
        return 0.0;
    }

    @Override
    public double obtenerVolumen() {
        return 0.0;
    }

    public String toString(){
    return "X: " + this.x + " y  " + this.y;
    
    }



}
