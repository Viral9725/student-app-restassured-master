package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
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
public class StudentDeleteTest {
     //HomeWork

    @Test
    public void deleteStudent(){
        //Homework
        String email = TestUtils.getRandomValue() + "Prime123@gmail.com";
        List<String> courseList = new ArrayList<>();
        courseList.add("Selenium");
        courseList.add("Rest Assured");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("PrimeTest");
        studentPojo.setLastName("Testing");
        studentPojo.setEmail(email);
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(courseList);
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .body(studentPojo)
                .delete("/1");
        response.prettyPrint();
        response.then().statusCode(404);

    }

}
