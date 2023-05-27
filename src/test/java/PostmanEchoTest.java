import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class PostmanEchoTest {
    @Test
    void PostmanEchoTest() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("clients data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("clients data"))
        ;

    }
}
