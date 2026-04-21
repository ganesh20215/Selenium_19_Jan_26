package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PostAPIAutomation {

    @Test
    public void verifyPostAPI(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
        SoftAssert sf = new SoftAssert();

        JSONObject js = new JSONObject();
        JSONObject bd = new JSONObject();
        js.put("firstname", "Sachin");
        js.put("lastname", "Lad");
        js.put("totalprice", "123");
        js.put("depositpaid",true);
        js.put("additionalneeds", "Breakfast With Automation");
        js.put("bookingdates", bd);

        bd.put("checkin", "2018-01-01");
        bd.put("checkout", "2019-01-01");

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(js.toJSONString())
                .when()
                .log().all()
                .post()
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertNotNull(response.jsonPath().getString("bookingid"));
        sf.assertEquals(response.jsonPath().getString("booking.firstname"), "Sachin");
        sf.assertEquals(response.jsonPath().getString("booking.lastname"), "Lad");
        sf.assertAll();
    }
}
