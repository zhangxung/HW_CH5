package pkg5_3;

public class Sample6_3 {
	
	public static void main(String[] args) {
		Car2 car1 = new Car2("1����");
		car1.start();
				
		for(int i = 0; i < 5; i++){
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}


class Car2 extends Thread {
	private String name;
	
	public Car2(String nm) {
		name = nm;
	}
	
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			
			try {
				sleep(1000);
				System.out.println("���b�i��" + name + "���B�z�u�@");
			}
			catch(InterruptedException e) {	
			}
		}
	}
}
