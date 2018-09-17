package RestAssuredFramework.RestAssuredFramework;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.InputStream;

import javax.mail.internet.ContentType;

public class Third {
	//@Test
	public void test()
	{
		
	String	responceinstring =get("http://services.groupkt.com/country/search?text=lands").asString();
	      System.out.println("responce in String"+ responceinstring);
					
		
	}
	//@Test
	public void test1()
	{
		
	InputStream	instring =get("http://services.groupkt.com/country/search?text=lands").asInputStream();
	      System.out.println("responce in String"+ instring.toString().length());

}
	//@Test
	public void test2()
	{
		
	byte[]	inbyte =get("http://services.groupkt.com/country/search?text=lands").asByteArray();
	      System.out.println("responce in String"+ inbyte.length);
}
	//@Test
		public void test3()
		{
			//extract details using path
		
		      String taking = get("http://jsonplaceholder.typicode.com/photos/1").path("thumbnailUrl");
		      System.out.println(taking);
		       
				
}
	@Test
	public void test4()
	{
		//extract details for future use
	   Response response = 
	     given().
            when().
             get("http://jsonplaceholder.typicode.com/photos/1").
                   then().
                         extract().
                              response();
	                              System.out.println("Content type :" +response.contentType());
	                              System.out.println("any value like path :" +response.path("url"));	
	                              System.out.println("status code :" +response.statusCode());
	                              
	       
	}
	
}

