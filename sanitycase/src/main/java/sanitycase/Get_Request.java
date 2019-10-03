package sanitycase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Request {

	public static void main(String[] args) {
		// Get_Request

		RestAssured.baseURI = "http://lsapilistings.sulekha.com";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("/apiv2/Businesses/10253358/Campaigns/1555793/Threshold");
		int resp = response.getStatusCode();
		System.out.println("Status code is  " + resp + "  and Status message is " + response.asString());

	}
}