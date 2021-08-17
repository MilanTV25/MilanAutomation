package TestNGExample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	
	public void testDemo1()
	{
		Reporter.log("my test demo1 HI");
		Reporter.log("my test demo1 bye",false);
		Reporter.log("my test demo1 tata", true);
	}
@Test
	
	public void testDemo2()
	{
		Reporter.log("my test demo2 HI");
		Reporter.log("my test demo2 bye",false);
		Reporter.log("my test demo2 tata", true);
	}
@Test

public void testDemo3()
{
	Reporter.log("my test demo3 HI");
	Reporter.log("my test demo3 bye",false);
	Reporter.log("my test demo3 tata", true);
}
@Test

public void testDemo4()
{
	Reporter.log("my test demo4 HI");
	Reporter.log("my test demo4 bye",false);
	Reporter.log("my test demo4 tata", true);
}

}
