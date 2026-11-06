package hilosIndependientes;

public class tercerhilo extends Thread {
	
	@Override
	public void run() {
		for(int i = 1;i<6;i++ ) {
		System.out.println("algo"+i);
		}
			}

}
