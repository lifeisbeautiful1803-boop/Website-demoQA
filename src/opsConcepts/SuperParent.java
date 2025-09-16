package opsConcepts;

import org.testng.annotations.Test;

public class SuperParent {
	
	
	int a;
	
	public SuperParent(int a) {
		this.a=a;
	}

	@Test
	public int multiply() {
		System.out.println("");
		a = a * 4;

		return a;
	}

}
