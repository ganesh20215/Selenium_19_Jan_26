package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetRequestAPI {

    @Test
    public void verifyGetAPI(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
        SoftAssert sf = new SoftAssert();
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get("/3")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertEquals(response.jsonPath().getString("firstname"), "Mark");
        sf.assertEquals(response.jsonPath().getString("lastname"), "Wilson");
        sf.assertAll();
    }
}
