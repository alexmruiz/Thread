package tareaNoviembre;

public class Carrera extends Thread {
	
	String animal;
	
	//Extiendo de la clase Thread que es la clase que proporciona los métodos para poder crear hilos.
	//Construyo un constructor de un parámetro para poder pasarle en el método run() el tipo de animal.
	public Carrera(String animal) {
		super();
		this.animal = animal;
	}
	
	//Dentro del método run() creo un bucle for para que cuente de uno en uno desde el 1 hasta 10 y 
	//le digo que imprima por pantalla el nombre del animal y por la posición que va (la posición me la marca la variable i)
	public void run() {
		
		for (int i=1;  i<11; i++) {
			
		
		System.out.println(this.animal + " va por la posicion "+(i)+ " de la carrera");
		
		}
		
		System.out.println(this.animal+" ha terminado la carrera");
	
		}
		
	//Dentro del método main creo los objetos tortuga  y conejo y con estos objetos llamo al método star() para crear los hilos.
	//El algoritmo comienza con el hilo tortuga y cuando llega al join ejecuta este método hasta que muera y después ejecuta conejo.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carrera tortuga = new Carrera("Tortuga");
		Carrera conejo = new Carrera("Conejo");
		
		tortuga.start();
		try {
			tortuga.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		conejo.start();
		
	
		}
	
		
	}

	


