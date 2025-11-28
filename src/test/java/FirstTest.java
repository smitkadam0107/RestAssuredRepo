import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FirstTest {

    @Test //this is first test
    public void testUsersAPI() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
        .when()
                .get("/users/1")
       .then()
                .statusCode(200)
                .body("address.zipcode",equalTo( "92998-3874"))
                .body("address.geo.lng",equalTo( "81.1496"))
                .body("username",equalTo("Bret"));

    }

}
