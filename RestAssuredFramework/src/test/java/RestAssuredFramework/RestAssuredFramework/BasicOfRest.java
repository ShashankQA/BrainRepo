package RestAssuredFramework.RestAssuredFramework;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class BasicOfRest {
	
	//@Test
	public void test()
	{
	 // check status code
		RestAssured.given().get("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		   // or 
		       
		      given().
		         get("https://reqres.in/api/users/2").
		         
		         then().
		           statusCode(200).
		            log().all();
	}	
	//@Test
	public void test1()
	{
	 // verify single content using org.hamcrest.matchers library's using equel to method
		
		  // for the body we need to import some -- import static org.hamcrest.Matchers.*;
		      // check for the all import link -- https://github.com/rest-assured/rest-assured/wiki/GettingStarted#rest-assured 
		      given().
		         get("http://services.groupkt.com/country/get/all").
		         
		         then().
		         
		           body("RestResponse.result.name", equalTo("Afghanistan"));
		           
	}
	//@Test
	public void test2()
	{
	 // verify multiple content using org.hamcrest.matchers library's using equel to method
		
		  // for the body we need to import some -- import static org.hamcrest.Matchers.*;
		      // check for the all import link -- https://github.com/rest-assured/rest-assured/wiki/GettingStarted#rest-assured 
		      given().
		         get("http://services.groupkt.com/country/get/all").
		         
		         then().
		         
		           body("RestResponse.result.name",hasItems("Afghanistan","Albania"));
		      Reporter.log("yes paased");
	                                                        //http://services.groupkt.com/country/get/all
	}
	
  // @Test
    public void test3()
   {
      // parameter header can be set
	      given().
	         header("Content-Type","application/json").
	         
	         when().
	           get("https://reqres.in/api/register").
	         
	         then().
	         

               statusCode(200).
               log().all();
	                   // Reporter.log("yes paased");
	      //or
	      given().param("","").and().header("","").when().get("url").then().statusCode(200).log().all();
   }
   //@Test
   public void test4()
   {
	   // xml with body
	   given().
	   get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10/").
	   then().
	   body("CUSTOMER.ID",equalTo("10")).
	   log().all();
	   
   }
 //  @Test
   public void test5()
   {
	   // xml with multiple body
	   given().
	   get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10/").
	   then().
	   body("CUSTOMER.ID",equalTo("10")).
	   body("CUSTOMER.FIRSTNAME",equalTo("Sue")).body("CUSTOMER.LASTNAME",equalTo("Fuller")).
	   
	   log().all();
   
}
   //@Test
   public void test6()
   {
	   // xml with COMPARE complete text()
	   given().
	   get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10/").
	   then().
	   body("CUSTOMER.text()",equalTo("10SueFuller135 Upland Pl.Dallas")).
	  
	   log().all();
   
}
   //@Test
   public void test7()
   {
	   // xml with xpath
	   given().
	   get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10/").
	   then().
	   body(hasXPath("/CUSTOMER/FIRSTNAME",containsString("Sue"))).
	  
	   log().all();
}
   @Test
   public void test8()
   {
	   // xml with xpath type
	   given().
	   get("http://www.thomas-bayer.com/sqlrest/INVOICE").
	   then().
	   body(hasXPath("/INVOICEList/INVOICE[text()='40']")).
	  
	   log().all();
}
}


