package org.miteshdandade;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

/**
 * This class contains tests for the REST API of the DemoQA Book Store.
 * 
 * The `GetBookDetails()` test method sends a GET request to the
 * `/BookStore/v1/Books` endpoint
 * and prints the status and response of the API call.
 * 
 * The `GetResponseAsAString()` test method also sends a GET request to the
 * `/BookStore/v1/Books`
 * endpoint, but instead of printing the response, it returns the response body
 * as a string.
 */
public class RestAssuredAPITest {
    
    /**
     * Sends a GET request to the `/BookStore/v1/Books` endpoint and prints the
     * status and response of the API call.
     */
    @Test
    public void GetBookDetails() {
        // Specify the Base URL to the RestFul Webservice
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        // Get the RequestSpecification of the Request to be sent to the server
        RequestSpecification httpRequest = RestAssured.given();
        // Specify the Method type (GET) and the parameter if any
        // In this Case the request does not take any parameters
        Response response = httpRequest.request(Method.GET, "");
        // Print the Status and the message of the Body of the response received from
        // the server
        System.out.println("\n Status Received :- " + response.statusLine());
        System.out.println("\n Response :- " + response.prettyPrint());
    }

    /**
     * Sends a GET request to the `/BookStore/v1/Books` endpoint and returns the
     * response body as a string.
     */
    @Test
    public void GetResponseAsAString() {
        // Specify the Base URL to the Restful Web Service
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

        // Get the RequestSpecification of the Request that is to be sent
        // to the Server
        RequestSpecification httpRequest = RestAssured.given();

        // Call the RequestSpecification.get() method to get the Response
        // Make Sure to Specify the Resource name
        Response response = httpRequest.get("");

        // Response.asString method will directly return the content of the body as a
        // String

        System.out.println("Response Body is :-" + response.asString());

    }
}
