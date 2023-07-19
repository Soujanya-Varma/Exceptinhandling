package exceptioncode;

import java.util.Scanner;

class operations{
	void f1() throws Exception{
		System.out.println("inside fun1");
		Scanner sc=new Scanner(System.in);
			
			System.out.println("Division operation");
			System.out.println("enter the numerator");
			int num=sc.nextInt();
			System.out.println("enetr the denominator");
			int den=sc.nextInt();
			int res=num/den;
			System.out.println(res);
			System.out.println("left fun1");
	}
	void f2() throws Exception{
		System.out.println("Inside fun2");
		f1();
		System.out.println("left fun2");
		
	}
	void f3() {
		System.out.println("Inside fun2");
		
		System.out.println("left fun2");
//		try {
//			System.out.println("inside fun3");
//			f2();
//		}
//		catch(Exception e) {
//			System.out.println("exception handled");
//		}
//		System.out.println("left fun3");
	}
}

public class code2 {
	public static void main(String[] args) {
		System.out.println("inside main");
		operations op=new operations();
		op.f3();
		System.out.println("left main");
		
	}
	

}
