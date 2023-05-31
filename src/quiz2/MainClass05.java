package quiz2;

import java.util.Scanner;

class Quiz05{
	public void test() {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력");
		int num = input.nextInt();
		if(num < 0) {
			num*=-1;
			System.out.println(num);
		}
	}
}

public class MainClass05 {
public static void main(String[] args) {
	Quiz05 q = new Quiz05();
	q.test();
}
}
