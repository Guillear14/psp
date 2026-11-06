package hilosIndependientes;

public class segundohilo extends Thread {
	
	@Override
	public void run() {
		for(char i= 'a'; i<'f';i++) {
			System.out.println(i);
		}
	}
}
