package ejercicio1y2;

public class main {
	public static void main(String[] args) {
		hola h1 = new hola(1);
		hola h2 = new hola(2);
		Thread hilo1 = new Thread(h1);
		Thread hilo2 = new Thread(h2);
		hilo1.start();
		hilo2.start();
		
		saludador t1 = new saludador(1);
		saludador t2 = new saludador(2);
		t1.start();
		t2.start();
	}
}