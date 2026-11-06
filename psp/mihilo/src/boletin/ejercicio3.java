package boletin;

import java.util.Random;

class Caballo extends Thread {
    private int idCaballo;

    public Caballo(int id) {
        this.idCaballo = id;
    }
    @Override
    public void run() {
        int distancia = 0;
        Random rand = new Random();
        while (distancia < 100) {
            distancia += rand.nextInt(10) + 1;
            System.out.println("Caballo " + idCaballo + ": " + distancia + " metros");
            if (distancia >= 100) {
                System.out.println("¡El caballo " + idCaballo + " ha llegado a la meta!");
                break;
            }
            try {
                Thread.sleep(rand.nextInt(401) + 100); 
            } catch (InterruptedException e) {
                System.out.println("Caballo " + idCaballo + " interrumpido.");
            }
        }
    }
}

public class ejercicio3 {
    public static void main(String[] args) {
        Caballo[] caballos = new Caballo[5];
        for (int i = 0; i < 5; i++) {
            caballos[i] = new Caballo(i + 1);
            caballos[i].start();
        }
    }
}