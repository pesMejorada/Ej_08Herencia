package es.curso.figuras;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
EJERCICIO HERENCIA


1. Crear una clase abstracta Figura que contenga los métodos obtenerArea,
obtenerVolumen y obtenerNombre (o getNombre()).
         *
 2. * De la clase anterior, heredan las siguientes clases 
 (las cuales contienen los métodos habituales y deben 
 sobreescribir los métodos que sean necesarios):
Punto.
Círculo.
Cilindro (un cilindro se define por un punto, un radio y una altura.
El área de un cilindro es dos veces el área de un círculo más 2 *PI*
radio * altura, y el volumen es PI radio ^2 * altura).
Crear un ArrayList de figuras como prueba, donde el primer elemento del
vector sea un punto, el segundo un círculo y el tercero un cilindro. 
Posteriormente mostrar por pantalla de forma continuada los nombres, 
áreas y volúmenes de cada figura.
         *
         *
         */

        Punto punto = new Punto(2,3);

        Circulo circu = new Circulo(3,4,7);

        Cilindro cilin = new Cilindro(0,1,5.6, 8);

        Figura arreglo[] = new Figura[3];

        arreglo[0]= punto;
        arreglo[1]= circu;
        arreglo[2] = cilin;




        
    }


}
