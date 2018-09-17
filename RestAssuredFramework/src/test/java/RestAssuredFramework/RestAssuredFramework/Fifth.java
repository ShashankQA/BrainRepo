package RestAssuredFramework.RestAssuredFramework;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Fifth {
	@Test
	public void test()
	{
		String response = given().
		  get("").
		  then().
		  extract().asString();
		
		    from(response).get("id");
		   
	}

}
