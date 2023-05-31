package quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Quiz03{
	public int op(ArrayList<String> arr) { //연산
//		System.out.println(arr.get(0) + arr.get(1) );  //문자열이기 때문에 합쳐져서 출력됨
		//System.out.println(Integer.parseInt(arr.get(0)) + Integer.parseInt(arr.get(1)));
		int sum;
		sum = Integer.parseInt(arr.get(0)) + Integer.parseInt(arr.get(1));
		return sum;
	}
	public ArrayList<String> in() {//입력
		ArrayList<String> arr = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("수 입력");
		int num = input.nextInt();
		arr.add( num+"" );
		arr.add( input.nextInt()+"" ); // 직접적으로 저장하는 방법
		//System.out.println( arr );
		return arr;
	}
	public void pr(ArrayList<String> arr , int sum) {//출력
		System.out.println(arr.get(0)+"+"+arr.get(1)+"="+sum);
	}
}

public class MainClass03 {
public static void main(String[] args) {
	Quiz03 q = new Quiz03();
	ArrayList<String> arr = q.in();
	//System.out.println("main arr : "+arr);  //중간에 확인 하기위해서 쓴거 
	int sum = q.op( arr );
	//System.out.println("sum : " + sum);  // op값 중간 출력해보는것
	q.pr( arr, sum );
}
}
