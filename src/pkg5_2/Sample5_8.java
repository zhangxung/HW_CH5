package pkg5_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample5_8 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
					
			String str1 = br.readLine();
			String str2 = br.readLine();
				
			System.out.println("�g�J���ɮפ�����Ӧr��O");
			System.out.println(str1);
			System.out.println(str2);
			
			br.close();
		}
		catch(IOException e){
			System.out.println("��X�J���~"+e);
		}
	}
}
