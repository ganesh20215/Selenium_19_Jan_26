package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PutAPIAutomation {

    @Test
    public void verifyPutAPI(){
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

        JSONObject js = new JSONObject();
        JSONObject bd = new JSONObject();
        js.put("firstname", "Shehal");
        js.put("lastname", "Lad");
        js.put("totalprice", "123");
        js.put("depositpaid",false);
        js.put("additionalneeds", "Breakfast With Automation");
        js.put("bookingdates", bd);
        bd.put("checkin", "2018-01-01");
        bd.put("checkout", "2019-01-01");
        response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token="+token)
                .body(js.toJSONString())
                .when()
                .log().all()
                .put("/booking/3")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertEquals(response.jsonPath().getString("firstname"), "Shehal");
        sf.assertEquals(response.jsonPath().getString("lastname"), "Lad");
        sf.assertAll();
    }
}
