package boletin;

public class ejercicio4 {
	static class TablaDeMultiplicar extends Thread{
		int numero;

		public TablaDeMultiplicar(int numero) {
			this.numero = numero;
		}
		
		public void run() {
			int calculo;
			for(int i = 0; i<11; i++) {
				calculo = numero * i;
				System.out.println("numero: "+numero+" multiplicado por: "+i+" da como resultado: "+calculo);
			}
		}
		
	}

	public static void main(String[] args) {
		TablaDeMultiplicar t1 = new TablaDeMultiplicar(1);
		TablaDeMultiplicar t2 = new TablaDeMultiplicar(2);
		TablaDeMultiplicar t3 = new TablaDeMultiplicar(3);
		TablaDeMultiplicar t4 = new TablaDeMultiplicar(4);
		TablaDeMultiplicar t5 = new TablaDeMultiplicar(5);
		TablaDeMultiplicar t6 = new TablaDeMultiplicar(6);
		TablaDeMultiplicar t7 = new TablaDeMultiplicar(7);
		TablaDeMultiplicar t8 = new TablaDeMultiplicar(8);
		TablaDeMultiplicar t9 = new TablaDeMultiplicar(9);
		TablaDeMultiplicar t10 = new TablaDeMultiplicar(10);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}

}
