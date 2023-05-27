import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class PostmanEchoTest {
    @Test
    void PostmanEchoTest() {
        // Given - When - Then

        given()
                .baseUri("https://postman-echo.com")
                .body("clients data")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("clients data"))
        ;

    }
}
