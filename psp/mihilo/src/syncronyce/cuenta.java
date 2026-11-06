package syncronyce;

public class cuenta {
		private static int saldo = 1000;
	static class Ingresador extends Thread {
		
		@Override
		public void run() {
			for(int i = 0; i < 1000; i++) {
				synchronized(cuenta.class) {
					saldo = saldo + 10;
				}
			}
		}	
	}
	static class Retirador extends Thread {
		@Override
		public void run() {
			for(int i = 0; i < 500; i++) {
				synchronized(cuenta.class) {
					saldo = saldo - 10;
				}
			}
		}
	}

	public static void main(String[] args) {
		Ingresador ingresa = new Ingresador();
		Retirador retirar = new Retirador();
		ingresa.start();
		retirar.start();
		try {
			ingresa.join();
			retirar.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(saldo); 
	}
}