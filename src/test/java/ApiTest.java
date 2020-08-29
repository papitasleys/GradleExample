import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static  io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class ApiTest {

    @Test
    public void caranavairus(){
        RestAssured.baseURI = String.format("https://api.quarantine.country/api/v1/summary/latest");

        Response response = given()
                .header("Accept", "application/jason")
                .get();

        assertEquals(200, response.getStatusCode());

        String body = response.getBody().asString();
        System.out.println("Body response: " + body);
    }
}
