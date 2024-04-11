package org.miteshdandade;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class QueryParameterTest {
    /**
     * Tests the behavior of the BookStore API when using a query parameter.
     * This test sends a GET request to the "/Book" endpoint with the "ISBN" query
     * parameter set to "9781449325862".
     * It then verifies that the response contains the expected book title.
     */

         /**
     * A description of the entire Java function.
     *
     * @param  paramName	description of parameter
     * @return         	description of return value
     */
    @Test
    public void testQueryParameter() {
        RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1";
        RequestSpecification httpRequest = RestAssured.given();
        Response res = httpRequest.param("ISBN", "9781449325862").get("/Book");
        ResponseBody body = res.body();
        String rdby = body.asString();
        JsonPath jpath = new JsonPath(rdby);
        String title = jpath.getString("title");
        System.out.println("\n The Book Title is :- " + title);

    }
    
}
