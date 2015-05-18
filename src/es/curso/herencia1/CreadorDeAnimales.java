package es.curso.herencia1;

public class CreadorDeAnimales {
  public static void main(String[] args) {
	Perro p1 = new Perro("Pluto", 4, "Lana");
	p1.emitirSonido();
	System.out.println(p1.getNombre());
	p1.setNombre("Lassie");
	System.out.println(p1.getNombre());
	
	Pajaro pajaro1 = new Pajaro("Piolín", 2, "Plumón");
    System.out.print(pajaro1.getNombre());
	pajaro1.emitirSonido();
	
	Pajaro pajaro2 = new Pajaro();
	pajaro2.setNombre("Loquillo");
	pajaro2.setNumPatas(2);
	pajaro2.setTipoPluma("Plumita");
	
//	Animal a1 = new Animal();// Animal es una clase Abstracta 
//	                         // no se puede hacer un new...
//	
//	a1.emitirSonido(); // error ! metodo no implementado en la clase Animal
	
	Animal a1; // referencia tipo Animal
	a1=p1;  // a1 'apunta' al mismo objeto que p1
	System.out.println("Emitiendo sonido a través de la referencia super.");
	a1.emitirSonido();
	a1=pajaro2; // a1 'apunta' al mismo obejto que pajaro2
	System.out.println(a1.getNombre()); 
	a1.emitirSonido(); 
	
	
	
	
  }
  
}



















