package hilosIndependientes;

public class primerhilo extends Thread {
	
	@Override
	public void run() {
		for(int i = 1; i<6;i++) {
		System.out.println(i);
		}
	}
}
