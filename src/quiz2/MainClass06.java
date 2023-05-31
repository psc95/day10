package quiz2;

import java.util.Scanner;

class Quiz06{
	public int in() {
		Scanner in = new Scanner(System.in);
	    System.out.println("거꾸로 수 입력 >>>>");
	    int num = in.nextInt();
	    return num;
	}
	
	public int op(int a) {
		int c = 0, reverse=0,tmp;
		while(true) {
		       tmp=a%10;
		       reverse*=10;
		       reverse+=tmp;
		       a/=10;
		       c = reverse;
		       if(a==0)
		          break;
		    }
			return c;
	}
	
	public void pr(int b) {
		System.out.println("거꾸로 수 : " +b);
	}
}

public class MainClass06 {
public static void main(String[] args) {
	Quiz06 q = new Quiz06();
	int a = q.in();
    int b = q.op(a);
    q.pr(b);
}
}
