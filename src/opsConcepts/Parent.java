package opsConcepts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parent  {

	int a;
	
	public Parent() {
		
	}

	public Parent(int a) {
		this.a=a;
	}

	@BeforeTest
	public void btest() {
		System.out.println("Before test of Parent class");
	}

	@Test
	public void demo() {
		System.out.println("Function of Parent class");
	}

	@Test
	public int add() {
		System.out.println("");
		a = a + 1;

		return a;
	}
	@Test
	public int sub() {
		System.out.println("");
		a = a - 1;

		return a;
	}


}
