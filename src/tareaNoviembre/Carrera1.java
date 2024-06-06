package tareaNoviembre;

public class Carrera1 extends Thread {
	
	String animal;
	
	//Al igual que en la clase carrera extiendo de la clase Thread que es la clase que proporciona los métodos para poder crear hilos.
	//Construyo un constructor de un parámetro para poder pasarle en el método run() el tipo de animal que está corriendo.
	
		
	public Carrera1(String animal) {
		super();
		this.animal = animal;
	}
	//En este método run para conseguir que el conejo corra más rápido que la tortuga y llegue antes a la meta hago un bucle for
	//que cuenta desde 1 hasta 10 y marca la posición de la carrera. Le digo que imprima por pantalla el animal que está corriendo 
	//y que le de un retardo de un segundo, dejando este hilo como principal.
	//Dentro de este bucle for hago un if y le digo que si animal es igual a tortuga que ese hilo lleve un retardo de 4 segundos.
	public void run() {
		
		for (int i=1;  i<11; i++) {
			
			System.out.println(this.animal + " va por la posicion "+(i)+ " de la carrera");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (animal.equals("Tortuga")) {
	            try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		}
		System.out.println(this.animal+" ha terminado la carrera");
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carrera1 tortuga = new Carrera1("Tortuga");
		Carrera1 conejo = new Carrera1("Conejo");
		
		conejo.start();
		tortuga.start();
		
	}}
		
		
		
		
	
	
		
	

	



