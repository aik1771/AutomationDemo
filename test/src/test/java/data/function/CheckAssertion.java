package data.function;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckAssertion {
	
	public static void AssertCheck(String result, String actual)
	{
		Assert.assertEquals(result, actual);
		
		
	}

}
