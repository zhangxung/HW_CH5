package pkg5_3;

public class Sample6_2 {
	
	public static void main(String[] args) {
		Car1 car1 = new Car1("1����");
		car1.start();
		
		Car1 car2 = new Car1("2����");
		car2.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}


class Car1 extends Thread {
	private String name;
	
	public Car1(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("���b�i��" + name + "���B�z�u�@");
		}
	}
}
