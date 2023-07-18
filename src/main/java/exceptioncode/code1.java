package exceptioncode;

import java.util.Scanner;

public class code1 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Division operation");
			System.out.println("enter the numerator");
			int num=sc.nextInt();
			System.out.println("enetr the denominator");
			int den=sc.nextInt();
			int res=num/den;
			System.out.println(res);
			System.out.println("array operation ");
			System.out.println("Array size");
			int n=sc.nextInt();
			int arr[]=new int[n];
			int arr1[]=null;
			System.out.println("enetr the pos to which value has to be added");
			int pos=sc.nextInt();
			System.out.println("enter the value to be added");
			int val=sc.nextInt();
			arr[pos]=val;
			System.out.println("data added into the array");
		}
		catch(ArithmeticException e1) {
			System.out.println("ArithmeticException");
		}
		catch(NegativeArraySizeException e2) {
			System.out.println("NegativeArraySizeException");
		}
		catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println("ArrayIndexOutOfBoundException");
		}
//		catch(InputMismatchException e4) {
//			System.out.println("InputMismatchException");
//		}
		catch(NullPointerException e5) {
			System.out.println("NullPointerException");
		}
		catch(Exception e6) {
			System.out.println("Exception occured");
		}
		
		
	}

}
