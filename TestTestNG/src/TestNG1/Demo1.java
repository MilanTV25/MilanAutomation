package TestNG1;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends BaseTest{

	@Test
	public void test2()
	{
		Reporter.log("test2",true);
	}
}
