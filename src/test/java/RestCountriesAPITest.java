import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestCountriesAPITest {
	
	@Test
	public void getCountryNegativeTest() {
        Response response = getResponseStatus("hyderabad");
        Assert.assertEquals(404, response.getStatusCode());
        
	}
	@Test
	public void getCountryPositiveTest() {
        Response response = getResponseStatus("india");
        Assert.assertEquals(200, response.getStatusCode());
	}
	
	public Response getResponseStatus(String name) {
        return RestAssured.get("https://restcountries.com/v3.1/name/" + name + "?fullText=true");
    }

}
