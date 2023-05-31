package quiz2;

import java.util.Scanner;

class Quiz03{
	public int in() {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num = input.nextInt();
		return num;
	}
	
	public int op(int a) {
		if (a % 3 == 0) {
			return a;
		}else {
			return a;
		}
	}
	
	public void pr(int b) {
		if (b % 3 == 0) {
			System.out.println(b+"은 3의 배수입니다.");
		}else {
			System.out.println(b+"는 3의 배수가 아닙니다.");
		}
	}
}

public class MainClass03 {
public static void main(String[] args) {
	Quiz03 q = new Quiz03();
	int a = q.in();
	int b = q.op(a);
	q.pr(b);
}
}
