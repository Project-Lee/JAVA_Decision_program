package TestClass;

import java.util.Scanner;
import java.util.Random;




public class Test {

	public static void add() {
		
		boolean run = true;
		while(run) {
			
			System.out.println("Loading... 10% ■□□□□□□□□□" );
			try {

				Thread.sleep(1000); //1초 대기

			} catch (InterruptedException e) {

				e.printStackTrace();
				
			}
			
			System.out.println("Loading... 45% ■■■■□□□□□□");
			try {

				Thread.sleep(1000); //1초 대기

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println("Loading... 90% ■■■■■■■■■□");
			
			try {

				Thread.sleep(1000); //1초 대기

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			run = false;

		
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		boolean run = true;
		String[] number = new String[3];
		
		while(run) {
			
			System.out.println("먹고싶은 음식 입력");
			
			for(int i=0; i<number.length; i++) {
				
				number[i] = scan.next();
				
			}
						
			add();
			
			int choise = 0;
			
			choise = rand.nextInt(3);
			System.out.println(number[choise]);
	}
}
}