package quiz2;

import java.util.Scanner;

class Quiz04{
	public void test() {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num = input.nextInt();
		int cnt = 0;
		for(int i = 2; i <=num; i++) {
			for(int j = 2; j<=num; j++) {
				if(i%j == 0) 
					cnt++;
				
			}
			if(cnt == 1)
			System.out.println("소수 : "+i);
			cnt = 0;
		}
		
}
}
public class MainClass04 {
public static void main(String[] args) {
	Quiz04 q = new Quiz04();
	q.test();
}
}
