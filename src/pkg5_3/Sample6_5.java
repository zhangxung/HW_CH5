package pkg5_3;

public class Sample6_5 {
	
	public static void main(String[] args) {
		Car4 car1 = new Car4("1����");
		car1.start();
				
			try {
				car1.join();
			}
			catch(InterruptedException e) {	
			}
			System.out.println("����main()���B�z�u�@");
	}
}

class Car4 extends Thread {
	private String name;
	
	public Car4(String nm) {
		name = nm;
	}
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("���b�i��" + name + "���B�z�u�@");		
		}
	}
}	