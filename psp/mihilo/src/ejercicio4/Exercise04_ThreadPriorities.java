package ejercicio4;
public class Exercise04_ThreadPriorities {
    static class MyThread extends Thread {
        String name;
        
        public MyThread(String name) {
            this.name = name;
        }
        
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println(this.name + "\t" + i);
                //Thread.yield();
            }
        }
    }
    
    public static void main(String[] args) {
    	/*
    	 * 1. Ejecución por defecto: Sale todo mezclado y al azar. Como los dos hilos 
    	 * tienen la prioridad por defecto (5), el SO hace un poco lo que quiere y los va alternando.
    	 * 
    	 * 2. Efecto de Thread.yield(): Ahora se alternan mucho mejor. Básicamente el hilo 
    	 * le dice a la CPU "cedo mi turno", así que se reparten el tiempo de forma más justa.
    	 * 
    	 * 3. Prioridad máxima a t1: El hilo t1 acapara todo el procesador. Imprime casi todo 
    	 * del tirón y t2 se queda bastante rezagado esperando su hueco.
    	 * 
    	 * 4. Prioridades extremas (t2 máx, t1 mín): Pasa justo al revés. El t2 se come toda la CPU 
    	 * y termina rapidísimo, mientras que el pobre t1 casi ni rasca tiempo de ejecución.
    	 */
    	
        MyThread t1 = new MyThread("T 1:");
        MyThread t2 = new MyThread("T 2:");
        
        //t1.setPriority(Thread.MAX_PRIORITY);
       
        //t2.setPriority(Thread.MAX_PRIORITY); 
        //t1.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
    }
}

