package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo extends BaseTest{

	@Test
	public void test1()
	{
		Reporter.log("test1",true);
	}
	
}