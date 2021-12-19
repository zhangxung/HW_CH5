package pkg5_3;

public class Sample6_8 {
	
	public static void main(String[] args) {
		Company1 cmp = new Company1();
		
		Driver1 drv1 = new Driver1(cmp);
		drv1.start();

		Driver1 drv2 = new Driver1(cmp);
		drv2.start();
	}
}

class Company1 {
	private int sum = 0;
	
	public synchronized void add(int a) {
		int tmp = sum;
		System.out.println("�ثe���X�p���B�O" + tmp + "��");
		System.out.println("�Ȩ�" + a + "���F");
		tmp = tmp + a;
		System.out.println("�X�p���B�O" + tmp + "��");
		sum = tmp;
	}
}

class Driver1 extends Thread {
	private Company1 comp;
	
	public Driver1 (Company1 c) {
		comp = c;
	}
	
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			comp.add(50);
		}	
	}
}