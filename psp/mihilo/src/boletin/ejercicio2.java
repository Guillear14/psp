package boletin;

public class ejercicio2 {
	static class Hilo extends Thread{
		String nombre;
		int numero;
		public Hilo (String nombre, int numero) {
			this.nombre = nombre;
			this.numero = numero;
		}
		
		public void run() {
			for(int i = 0; i<numero; i++) {
				System.out.println("contador: "+nombre+" "+i);
			}
		}
	}
	 public static void main(String[] args) {
		 Hilo t1 = new Hilo("primero",5);
		 Hilo t2 = new Hilo("segundo",10);
		 Hilo t3 = new Hilo("tercero",15);
		 
		 
		/* t1.start();
		 t2.start();
		 t3.start();*/
		 
		 t1.run();
		 t2.run();
		 t3.run();
	 }

}
