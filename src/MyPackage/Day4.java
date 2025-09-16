package MyPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@BeforeSuite
	
	public void bf()
	{
		System.out.println("This is before suite");
	}
	
	@BeforeSuite
	
	public void bt()
	{
		System.out.println("This is before suite1");
	}
	@Parameters({"suite"})
	@Test	
	
	public void webloginhomeLoan()
	{
		System.out.println("home loan- web login!!");
		System.out.println("Day 4- suite level");
	}
@Test(dependsOnMethods= {"webloginhomeLoan","mobilesignINhomeLoan"})
	
	public void mobileloginhomeLoan()
	{
		System.out.println("home loan- mobile login!!");

	}


@Test
public void mobilesignINhomeLoan()
{
	System.out.println("home loan- mobile SIGN IN!!");

}

@Test

public void mobilesignOUThomeLoan()
{
	System.out.println("home loan- mobile SIGN OUT!!");

}
@Test

public void APIloginhomeLoan()
{
	System.out.println("home loan- API login!!");

}


@BeforeTest

public void btt()
{
	System.out.println("before test- Day 4!!");
}

}