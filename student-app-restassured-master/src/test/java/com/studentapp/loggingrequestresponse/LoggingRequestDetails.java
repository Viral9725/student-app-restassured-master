package com.studentapp.loggingrequestresponse;

import com.studentapp.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay
 */
public class LoggingRequestDetails extends TestBase {
    /**
     * This test will print out all the request headers
     */
    @Test
    public void test001() {

        System.out.println("---------------Printing Request Headers------------------");
//     It for everything
//        given().log().all()
        given().log().ifValidationFails()
                .when()
                .get("/list")
                .then().log().ifValidationFails()
                .statusCode(201);
    }


    /**
     * This test will print out all the request Parameters
     */
    /*all below homework*/
    @Test
    public void test002() {
        System.out.println("---------------Printing Request Parameters------------------");
    }

    /**
     * This test will print out the Request body
     */
    @Test
    public void test003() {
        System.out.println("---------------Printing Request Body------------------");


    }

    /**
     * This test will print out All the details
     */
    @Test
    public void test004() {
        System.out.println("---------------Printing All the Request Details------------------");
    }


    /**
     * This test will print Request details if validation fails
     */
    @Test
    public void test005() {
        System.out.println("---------------Printing All the Request Details if validation fails------------------");
    }
}
