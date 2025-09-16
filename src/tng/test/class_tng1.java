package tng.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class_tng1 {
	
	
	@BeforeMethod
	public void TNG1() {
		System.out.println("TEST 1");
	}
	@AfterMethod
	public void TNG3() {
		System.out.println("TEST 3");
	}
	
	@Test
	public void TNG2() {
		System.out.println("TEST 2");
	}

}
