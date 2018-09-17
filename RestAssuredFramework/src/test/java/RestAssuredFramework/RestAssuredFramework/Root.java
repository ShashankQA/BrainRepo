package RestAssuredFramework.RestAssuredFramework;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Root {
	
	//@Test()
	public void test1()
	{
		//basic way to test all parameters
		given().
		  get("http://services.groupkt.com/country/get/all").
		    then().
		      body("RestResponse.result.name" , is("Afghanistan")).
		       body("RestResponse.result.alpha2_code" , is("AF")).
		       body("RestResponse.result.alpha3_code" , is("AFG"));
		       
		       // it failed because not getting proper API
		
		
		
	}
	//@Test()
	public void test2()
	{
		//using root fature
		given().
		  get("http://services.groupkt.com/country/get/all").
		    then().
		      root("RestResponse.result.name").
		       body("name" , is("Afghanistan")).
		       body("alpha2_code" , is("AF")).
		       body("alpha3_code" , is("AFG"));
		       
	
	}	
	@Test()
	public void test3()
	{
		// detach with root
		given().
		  get("http://services.groupkt.com/country/get/all").
		    then().
		      root("RestResponse.result.name").
		       body("name" , is("Afghanistan")).
		       body("alpha2_code" , is("AF")).
		        detachRoot("result").
		        body("result.alpha3_code" , is("AFG"));
	}
}
