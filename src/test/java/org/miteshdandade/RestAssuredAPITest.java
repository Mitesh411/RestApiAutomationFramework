package org.miteshdandade;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RestAssuredAPITest {
    @Test
    public void GetBookDetails(){
        //Specify the Base URL to the RestFul Webservice
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        // Get the RequestSpecification of the Request to be sent to the server
        RequestSpecification httpRequest = RestAssured.given();
        //Specify the Method type (GET) and the parameter if any
        //In this Case the request does not take any parameters
        Response response = httpRequest.request(Method.GET,"");
        //Print the Status and the message of the Body of the response received from the server
        System.out.println("\n Status Received :- "+response.statusLine());
        System.out.println("\n Response :- "+response.prettyPrint());
    }
    @Test
    public void GetResponseAsAString(){
        //Specify the Base URL to the Restful Web Service
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

        //Get the RequestSpecification of the Request that is to be sent
        // to the Server
        RequestSpecification httpRequest = RestAssured.given();

        //Call the RequestSpecification.get() method to get the Response
        //Make Sure to Specify the Resource name
        Response response = httpRequest.get("");

        //Response.asString method will directly return the content of the body as a String

        System.out.println("Response Body is :-"+response.asString());



    }
}
