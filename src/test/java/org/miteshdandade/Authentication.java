package org.miteshdandade;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authentication {
    
    @Test
    public void AuthenticationBasic(){
        RestAssured.baseURI = "https://restapi.demoqa.com/authentication/CheckForAuthentication";
        RequestSpecification request = RestAssured.given();

        Response response= request.get();
        System.out.println("Status code : " + response.getStatusCode());
        System.out.println("Status Message : "+response.body().asString());
    }
}
