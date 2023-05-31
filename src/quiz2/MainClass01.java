package quiz2;

import java.util.ArrayList;
import java.util.Scanner;

class Quiz01{
	public int op(ArrayList<String> a) {
		int aa = Integer.parseInt(a.get(0));
		int bb = Integer.parseInt(a.get(1));
		
		if(aa == bb) return -1;
			
		if(aa < bb) {
			int c = bb;
			return c;
		}
		else {
			int c = aa;
			return c;
		} 

	}
	public ArrayList<String> in() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("두 수 입력 : ");
		String num1 = input.next();
		String num2 = input.next();
		arr.add(num1); arr.add(num2);
		return arr;
	}
	public void pr(int  c) {
		if(c==-1) System.out.println("같은 수 입니다");
		else System.out.println("더 큰수는 "+c+" 입니다.");
		
	}
	
}

public class MainClass01 {
public static void main(String[] args) {
	
	Quiz01 q = new Quiz01();
	
	ArrayList<String> a = q.in();//[10, 20]
	
	int p = q.op(a);
	
	q.pr(p);
}
}
