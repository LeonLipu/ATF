package APPLICATION_API_TEST;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


/**
 * Created by brahmanandakar on 18/07/17.
 */
public class testApi {

    @Test
    public void test() {
        Response response = get("http://localhost:8080/students");
        System.out.println(response.getStatusCode());
        System.out.print(response.getBody());
        System.out.println(response.getContentType());
    }


}
