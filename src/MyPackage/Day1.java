package MyPackage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	@Parameters({"suitelevel"})
	@Test(groups={"smoke"})
	
	public void demo(String suite)
	{
System.out.println("hello world!!- demo");
System.out.println("Day 1- suite level");
Assert.assertTrue(false);

}
@Parameters({"URL","Username"})
	@Test
	public void demo1(String url, String username)
	{
System.out.println("hello world!!- demo 1");
System.out.println(url);
System.out.println(username);
System.out.println("parametrisation");

}
	
}
