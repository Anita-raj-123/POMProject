package tng.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class_tng2 {
	
	@BeforeMethod
	public void TNG7() {
		System.out.println("TEST 1");
	}
	@AfterMethod
	public void TNG8() {
		System.out.println("TEST 3");
	}
	
	@Test
	public void TNG9() {
		System.out.println("TEST 2");
	}

}
