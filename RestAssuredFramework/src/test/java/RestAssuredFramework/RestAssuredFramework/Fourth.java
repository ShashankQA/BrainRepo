package RestAssuredFramework.RestAssuredFramework;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.InputStream;
import java.util.List;



public class Fourth {
	
	/**
	 * verify reponse type
	 */
	
	//@Test
		public void test1()
		{
			given().
		 get("http://services.groupkt.com/country/search?text=lands").
		 
		 then().
		    contentType(ContentType.JSON);
		   // contentType(ContentType.XML).
		  //  contentType(ContentType.HTML);
		    
		      //System.out.println("responce in "+ type);
		      

		}
	/**
	 * GROOVY feachure 
	 */
	
	//@Test
		public void test2()
		{
			given().
		 get("http://services.groupkt.com/country/search?text=lands").
		 
		 then().
		   body("RestResponse.result.alpha3_code*.length().sum()" , greaterThan(10) );
}
		
		@Test
		public void test3()
		{
			//
		
			
		 String response = get("http://services.groupkt.com/country/search?text=lands").asString();
		          
		 
             
}
}
		
		
		
		
		
		
		
		
