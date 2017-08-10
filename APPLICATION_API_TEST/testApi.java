package APPLICATION_API_TEST;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


/**
 * Created by brahmanandakar on 18/07/17.
 */
public class testApi {

    @Test
    public void checksantity() {

             given()
                .when()
                .get("http://localhost:8080/students")
                     .then()
                     .statusCode(200)
             .log()
                     .all();



    }

    @Test
    public void checkpostRequest(){

        ResponseBody body = given().contentType("application/json").body("{\n" +
                "        \"id\": \"10\",\n" +
                "        \"firstname\": \"tttttt\",\n" +
                "        \"lastname\": \"kar\",\n" +
                "        \"standard\": \"Btech\"\n" +
                " }").when().post("http://localhost:8080/students/9").getBody();

        System.out.println(body.toString());
    }

    @Test
    public void getSingleStudent(){

      given().get("http://localhost:8080/students/4").then().log().all();


    }


}
