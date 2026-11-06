package syncronyce;

public class principal {
	private static int contador = 0;
	static class Incrementador extends Thread {
		@Override
		public void run() {
			for(int i = 0; i<100000;i++) {
				synchronized(principal.class) {
				contador++;
				}
			}
		}
	}
	public static void main(String[] args) {
		Incrementador icrementar = new Incrementador();
		Incrementador incrementar2 = new Incrementador();
		icrementar.start();
		incrementar2.start();
		try{
		icrementar.join();
		incrementar2.join();
		}catch(InterruptedException e) {
		}
		System.out.println("contador final: "+contador);
	}
}
