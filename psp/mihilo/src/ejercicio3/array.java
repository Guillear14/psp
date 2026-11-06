package ejercicio3;
import java.util.ArrayList;
import java.util.List;
class Hilo extends Thread {
	int id;
	public Hilo(int nombre) {this.id = nombre;}
	@Override
	public void run() {
			try {
				long tiempoEspera = (long) (Math.random() * (10000 - 500))+500;
				System.out.println("hola soy: " + id + " y voy a dormir: " + tiempoEspera);
				Thread.sleep(tiempoEspera);
				System.out.println("Hola, soy el hilo "+id+" y ya me he despertado");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
public class array {
	public static void main(String[] args) {
		List<Hilo> multihilos = new ArrayList<Hilo>();
		Hilo h1 = new Hilo(0);
		Hilo h2 = new Hilo(1);
		Hilo h3 = new Hilo(2);
		Hilo h4 = new Hilo(3);
		Hilo h5 = new Hilo(4);
		
		multihilos.add(h1);
		multihilos.add(h2);
		multihilos.add(h3);
		multihilos.add(h4);
		multihilos.add(h5);
		
		for(Hilo hilo:multihilos) {
			hilo.start();
		}
		System.out.println("El hilo principal ha terminado");
	}
}