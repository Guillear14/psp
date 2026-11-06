package varianteEjercicio3;

public class main {

	public static void main(String[] args) {
		trabajador ana = new trabajador("Ana");
		trabajador luis = new trabajador("Luis");
		trabajador marta = new trabajador("Marta");
		
		System.out.println("¡Comienza la carrera!");
		ana.start();
		luis.start();
		marta.start();
		try {
			ana.join();
			luis.join();
			marta.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("¡Carrera terminada!");
	}
}