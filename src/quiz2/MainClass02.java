package quiz2;

import java.util.Scanner;

class Quiz2{
	public int in() {
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = input.nextInt();
		return num;
	}
	
	public int op(int a) {
		if(a % 2 == 0) {
			return a;
		}
		else{
			return a;
		}
	}
	
	public void pr(int b) {
		if( b % 2 == 0) {
			System.out.println(b+"짝수입니다.");
		}
		else {
			System.out.println(b+"홀수입니다.");
		}
	}
}

public class MainClass02 {
public static void main(String[] args) {
	Quiz2 q = new Quiz2();
	int a = q.in();
	int b = q.op(a);
	q.pr(b);
	
	
	
	
}
}
