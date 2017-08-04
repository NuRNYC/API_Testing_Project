package ApiTesting.com.org.api;
import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import ApiTesting.com.org.additionalClasses.*;

import static com.jayway.restassured.RestAssured.*;
public class AppTest{

	//Simple GET Request to Posts
	//@Test
	public void test_01() {
		Response reps =given().
				parameter("id","111").
				when().
				get("http://ec2-54-174-213-136.compute-1.amazonaws.com:3000/posts");
		System.out.println(reps.asString());
	}
	
	//Simple POST Request
	//@Test
	public void test_02() {
		Response resp=given().
				body("{	\"userID\": 3,"
						+ "\"title\":\"post by NUR\","
						+ "\"body\":\"Body of post by NUR\"}").
				when().
				contentType(ContentType.JSON).
				post("http://ec2-54-174-213-136.compute-1.amazonaws.com:3000/posts");

		System.out.println("POST Request result: "+resp.asString());
	}


	//PUT Request to POSTS
	//@Test
	public void test_03() {
		Response resp=given().
				when().
				contentType(ContentType.JSON).
				body("{	\"userID\": 3,"
						+ "\"title\":\"post by NUR\","
						+ "\"body\":\"Body of post by NUR uses put request\"}").
				put("http://ec2-54-174-213-136.compute-1.amazonaws.com:3000/posts/111");

		System.out.println("PUT request result: " +resp.asString());
	}

	//DELETE Request
	//@Test
	public void test_04() {
		Response resp=given().
				when().
				delete("http://ec2-54-174-213-136.compute-1.amazonaws.com:3000/posts/111");

		System.out.println("Deleting "+ resp.asString());
	}

	//POST request to USER resource
	//@Test
	public void test_05() {
		Users users1= new Users();
		Posts post1= new Posts();
		Geo geo1=new Geo();
		Company company1=new Company();
		Address address1=new Address();
		
		
		address1.setStree("Add Lane");
		address1.setSuite("2141");
		address1.setCity("Alpharetta");
		address1.setZipcode("30005");
		
		company1.setName("Test Company Name");
		company1.setCatchPhrase("Test Company Catch Phrase");
		company1.setBs("TEST TEST TEST BS BS BS BS BS BS BS");
		
		
		geo1.setLat("-38.2386");
		geo1.setLng("57.2232");
		
		
		
		
		users1.setName("Test NAME");
		users1.setUsername("TUser");
		users1.setEmail("TestEmail@email.com");
		users1.setAddress(address1);
		users1.setGeo(geo1);
		users1.setPhone("99999999");
		users1.setWebsite("www.testwebsite.org");
		users1.setCompany(company1);
		
		post1.setUser(users1);
		
		Response resp=given().
				when().
				contentType(ContentType.JSON).
				body(users1).
				post("http://ec2-54-174-213-136.compute-1.amazonaws.com:3000/users");

		System.out.println("Response - POST request to USERS: "+ resp.asString());
	}
	
	//POST for Comments Resource
	@Test
	public void test_06() {
		Comments comments =new Comments();
		
		comments.setPostId("11");
		comments.setName("Test Comments Name");
		comments.setEmail("test@comments.com");
		comments.setBody("Comments body test Comments body test ");
		Response resp=given().
				when().
				contentType(ContentType.JSON).
				body(comments).
				post("http://ec2-54-174-213-136.compute-1.amazonaws.com:3000/comments");

		System.out.println("Response : - POST request to COMMENTS: "+ resp.asString());
	}
	

}