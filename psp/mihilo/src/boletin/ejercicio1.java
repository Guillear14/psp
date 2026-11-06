package boletin;

public class ejercicio1 {
	static class MyThread implements Runnable{
		String nombre;
		int numero;
		public MyThread(String nombre, int numero) {
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
		 MyThread t1 = new MyThread("primero",5);
		 MyThread t2 = new MyThread("segundo",10);
		 MyThread t3 = new MyThread("tercero",15);
		 
		 Thread th1 = new Thread(t1);
		 Thread th2 = new Thread(t2);
		 Thread th3 = new Thread(t3);
		 
		 th1.start();
		 th2.start();
		 th3.start();
	 }
}
