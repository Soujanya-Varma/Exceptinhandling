package exceptioncode;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getString() {
		return "your age is less than that 18,hence ur a kid";
	}
	
}
class OverAgeException extends Exception{
	public String getString() {
		return "your age is more than that 60,stop";
	}
	
}
class Candidate {
	int age;

	void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teh age");
		age=sc.nextInt();
}
	void verify() throws Exception{
		if(age<18) {
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getString());
			throw uae;
			
		}
		else if(age>60) {
			OverAgeException oae=new OverAgeException();
			System.out.println(oae.getString());
			throw oae;
			
		}
		else {
			System.out.println("issue the license");
		}
	}
}
class RTO{
	void grantLicense(Candidate c) {
		try {
			c.getData();
			c.verify();
		}
		catch(Exception e1){
			try {
				c.getData();
				c.verify();
			}
			catch(Exception e2){
				try {
					c.getData();
					c.verify();
				}
				catch(Exception e) {
					System.out.println("go home");
				}
			
		}
	}
}
}
public class code4 {
	public static void main(String[] args) {
		Candidate c1=new Candidate();
		RTO rt=new RTO();
		rt.grantLicense(c1);
				
	}

}
