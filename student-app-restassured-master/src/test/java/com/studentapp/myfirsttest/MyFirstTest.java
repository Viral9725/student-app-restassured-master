package com.studentapp.myfirsttest;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay Vaghani
 */
public class MyFirstTest  extends TestBase {

    @Test
    public void getAllStudentInfo() {

    /*    baby step
        given()
                .when()
                .get("http://localhost:8080/student/list")
                .then()
                .statusCode(200);

     */
        Response response = given()
                .when()
                .get("http://localhost:8080/student/list");
                response.then().statusCode(200);
                response.prettyPrint();
    }
}
