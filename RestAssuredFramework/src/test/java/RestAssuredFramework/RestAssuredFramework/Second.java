package RestAssuredFramework.RestAssuredFramework;

import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class Second {
	
	    
	        @Test
	        public void test2()
	        {
	        	
	        	
	        	      Response respo = get("https://reqres.in/api/users/2");

		              int Scode = respo.statusCode();
		          System.out.println("status code is " + Scode );
		          
		          Assert.assertEquals(Scode, 200);
		
			
		}
		// print the complete data in form of String
		
		@Test
		public void testDataAsString()
		{
			
		Response resp = get("https://reqres.in/api/users/2");
		
		              String allData = resp.asString();
		              long responceTime = resp.getTime();
		                              
		                  
		              System.out.println("status codedata is " + allData );
		              System.out.println("status responceTime " + responceTime );
		          
		                                     //or
		                    String allData1 = get("https://reqres.in/api/users/2").asString();
		                    long responceTime1 = get("https://reqres.in/api/users/2").getTime();
		                    
		                    
		                    
		                    System.out.println("status codedata is " + allData1 );
		                    System.out.println("status responceTime " + responceTime1 );
	        	                 
	        	
	        	
	        	
	        	
	        }
	
	
                  
}
