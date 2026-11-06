package ejercicio1y2;

public class hola extends java.awt.Frame implements Runnable {
	int modulo;
	public hola(int modulo) {
		this.modulo = modulo;
	}
	public void run() {
		if(modulo==1) {
		for(int i = 0; i<3;i++) {
		System.out.println("hola");
		}
		}else {
			for(int i = 0; i<3;i++) {
				System.out.println("Adios");
				}
		}
	}
}