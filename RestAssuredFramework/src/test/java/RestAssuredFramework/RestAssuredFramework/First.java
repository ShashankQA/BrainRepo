package RestAssuredFramework.RestAssuredFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class First {
	@Test
	public void test()
	{
		
	Response resp = RestAssured.get("https://reqres.in/api/users/2");
	
            
	
	              int Scode = resp.statusCode();
	          System.out.println("status code is " + Scode );
	          
	          Assert.assertEquals(Scode, 200);
	
		
	}
	// print the complete data in form of String
	
	@Test
	public void testDataAsString()
	{
		
	Response resp = RestAssured.get("https://reqres.in/api/users/2");
	
	              String allData = resp.asString();
	                              long responceTime = resp.getTime();
	              
	                    System.out.println("status codedata is " + allData );
	                    System.out.println("status responceTime " + responceTime );
	          
	          
	         // Assert.assertEquals(allData, 200);
	
		
	}
}
