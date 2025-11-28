import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FirstTest {

    @Test
    public void testUsersAPI() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
        .when()
                .get("/users/1")
       .then()
                .statusCode(200)
                .body("address.zipcode",equalTo( "92998-3874"))
                .body("geo.lng",equalTo( "81.1496"));

    }

}
