package exceptioncode;
import java.util.Scanner;

class Operation{
	void f1() throws Exception{
		try {
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
		catch(Exception e) {
			System.out.println("Exception handled in function 1");
			throw e;
		}
		finally {
			System.out.println("left f1");
		}
	}
}



public class code3 {
	public static void main(String[] args) {
		try {
		System.out.println("inside main");
		Operation op=new Operation();
		op.f1();
		}
		catch(Exception e) {
			System.out.println("exception handled in main");
		}
		finally {
		System.out.println("left main");
		}
	}

}
