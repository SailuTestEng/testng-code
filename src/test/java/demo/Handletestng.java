package demo;

import org.testng.annotations.Test;

public class Handletestng {
	
	
	
	@ Test (priority = -1)
	public void name() {
		System.out.println("enter user name");
	}
	@Test
	public void password() {
		System.out.println("enter password");
	}
	@Test
	public void login() {
		System.out.println("click on login");
	}
	

}
