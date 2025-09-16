package MyPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

	@BeforeClass
	
	public void bc()
	{
		System.out.println("before class- day3!!");

	}
	
	
	@Test(groups={"smoke"})
	
	public void weblogincarLoan()
	{
		System.out.println("car loan- web login!!");

	}
@Test
	
	public void mobilelogincarLoan()
	{
		System.out.println("car loan- mobile login!!");

	}
@Test

public void APIlogincarLoan()
{
	System.out.println("car loan- API login!!");

}

@AfterSuite

public void bf()
{
	System.out.println("This is after suite");
}
}