package org.miteshdandade;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * This class contains tests for validating the response from the DemoQA Book
 * Store API.
 * 
 * The `GetBookDetails` test verifies that the API returns a successful response
 * (status code 200) when retrieving book details.
 * 
 * The `ValidateHeader` test retrieves all the headers from the API response and
 * prints them to the console.
 */
public class RestAssuredTestResponse {

    @Test
    public void GetBookDetails() {
        // specify the Base URL to the Restful web Service
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

        // Get the Specification of the Request to be sent to the server
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.get();

        // Get the Status Code of the Request
        // If Request is Successful, Status Code will be 200

        int statuscode = response.statusCode();

        // Assert that Correct Status Code is Returned
        Assert.assertEquals(statuscode, 200, "Correct Status Code is Returned");

    }

    /**
     * Validates the headers of the response from the DemoQA Book Store API.
     * 
     * This method sends a GET request to the
     * "https://demoqa.com/BookStore/v1/Books" endpoint
     * and retrieves all the headers from the response. It then iterates over the
     * headers
     * and prints the name and value of each header to the console.
     * 
     * @throws AssertionError if the status code of the response is not 200 (OK)
     */
    @Test
    public void ValidateHeader() {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");
        // Get all the Headers and then iterate over all the headers to Print each
        // headers
        Headers allHeaders = response.headers();
        // Iterate over all Headers
        for (Header header : allHeaders) {
            System.out.println("Key :- " + header.getName() + " Value :- " + header.getValue());
            System.out.println("\n Print all Headers :- " + response.prettyPrint());
        }
    }

}
