package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import com.studentapp.utils.TestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StudentPutTest extends TestBase {

    //Homework for Update
    @Test
    public void updateStudent() {
        String email = TestUtils.getRandomValue() + "Prime123@gmail.com";
        List<String> courseList = new ArrayList<>();
        courseList.add("Selenium");
        courseList.add("Rest Assured");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Prime");
        studentPojo.setLastName("Testing");
        studentPojo.setEmail(email);
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(courseList);
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .body(studentPojo)
                .put("/1");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
