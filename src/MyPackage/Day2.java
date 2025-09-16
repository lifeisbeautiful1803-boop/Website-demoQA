package MyPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {

	@Test(dataProvider="datainput")
	
	public void demo(String username, String password)
	{
		System.out.println("hello world- Day 2!!");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeTest
	
	public void btt()
	{
		System.out.println("before test- Day 2!!");
	}
	
	
@DataProvider
public Object[][] datainput ()
{
	Object[][] data =new Object[3][2];
	data[0][0]="first username";
	data[0][1]="first password";
	
	data[1][0]="second username";
	data[1][1]="second password";
	
	data[2][0]="Third username";
	data[2][1]="Third password";
	
	return data;

}

}