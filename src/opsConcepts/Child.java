package opsConcepts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Child extends Parent {
	
	int a=1;
	Parent p= new Parent(a);
		@Test
	public void meth()
	{
		//System.out.println("Function of child class");
		//demo();
	
		System.out.println("add" +p.add());
	//	System.out.println("add" +p.multiply());
	}

}
