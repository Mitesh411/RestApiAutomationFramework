package org.miteshdandade;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authentication {

    @Test
    /**
     * A description of the entire Java function.
     *
     * @param paramName description of parameter
     * @return description of return value
     * 
     */
    /**
     * Tests basic authentication on the Unsplash API.
     * Sends a GET request to the /users/{username} endpoint
     * with no authentication.
     * Validates that a 401 Unauthorized status code is returned.
     * Prints the status code and response body to the console.
     */
    public void AuthenticationBasic() {
        RestAssured.baseURI = "https://unsplash.com//users/Mitesh411";
        RequestSpecification request = RestAssured.given();

        Response response = request.get();
        System.out.println("Status code : " + response.getStatusCode());
        System.out.println("Status Message : " + response.body().asString());
    }
}
