package org.learntestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassD {

	@AfterSuite
	private void m7() {
		System.out.println("@AfterSuite");
	}
	@AfterTest
	private void m8() {
		System.out.println("@AfterTest -Test2");
	}
	
	@BeforeClass
	private void mf1() {
		System.out.println("@BeforeClass - ClassD");
	}
	
	@AfterClass
	private void mf2() {
		System.out.println("@AfterClass - ClassD");
	}
	@AfterMethod
	private void mg1() {
		System.out.println("@AfterMethod - ClassD--@Test");
	}
	
	@BeforeMethod
	private void mg2() {
		System.out.println("@BeforeMethod - ClassD--@Test");
	}
	@Test
	private void mt1() {
		System.out.println("@Test - ClassD");
	}
	
}
