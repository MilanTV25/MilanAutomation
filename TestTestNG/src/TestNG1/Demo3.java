package TestNG1;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo3 {

	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
	}

	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@Test
	public void testA()
	{
		Reporter.log("create user",true);
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals("abc","xyz");
		Reporter.log("delete user",true);
		softAssert.assertAll();//always keep this as last statement
	}
}
