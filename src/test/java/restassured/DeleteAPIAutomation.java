package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DeleteAPIAutomation {

    @Test
    public void verifyDeleteAutomation(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
        SoftAssert sf = new SoftAssert();

        JSONObject jsBody = new JSONObject();
        jsBody.put("username", "admin");
        jsBody.put("password", "password123");

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(jsBody.toJSONString())
                .when()
                .log().all()
                .post("/auth")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();

        String token = response.jsonPath().getString("token");

        response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token="+token)
                .when()
                .log().all()
                .delete("booking/27")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_CREATED)
                .extract().response();
    }
}
