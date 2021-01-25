package ru.netology.postman;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class postmanTest1 {
  @Test
  void shouldPostQueryTest(){
    given()
            .baseUri("https://postman-echo.com")
            .contentType("text/plain; charset=UTF-8")
            .body("data")
            .when()
            .post("/post")
            .then()
            .statusCode(200)
            .contentType("application/json")
            .body("data", equalTo("data"));
 }
}
