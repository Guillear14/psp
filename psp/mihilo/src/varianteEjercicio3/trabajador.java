package varianteEjercicio3;

public class trabajador extends Thread {
	String nombre;
	int vueltasTotales = 10;
	public trabajador(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void run() {
		for (int i = 1; i <= vueltasTotales; i++) {
			try {
				long tiempoEspera = (long) (Math.random() * 401) + 100;
				Thread.sleep(tiempoEspera);
				System.out.println(nombre + " ha completado la vuelta " + i + " (tardó " + tiempoEspera + "ms)");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">>> ¡" + nombre.toUpperCase() + " HA LLEGADO A LA META! <<<");
	}
}